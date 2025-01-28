package services;

import models.ChannelRequests;
import models.Request;

import java.sql.*;
import java.util.Date;

public class RequestService {
    private String url = "jdbc:sqlite:/home/nurs/MegaLab/Databases/natv/natv.db"; //Linux
//    private String url = "jdbc:sqlite:D:/java/Lesson/MegaLab/Databases/natv/natv.db"; //Windows
    public void createRequest(Request request) throws SQLException {
        Connection connection = DriverManager.getConnection(url);

        PreparedStatement ps = connection.prepareStatement("insert into requests(client_name, request_text, phone_number, email) values (?,?,?,?)");
        ps.setString(1, request.getClientName());
        ps.setString(2, request.getText());
        ps.setString(3, request.getPhoneNumber());
        ps.setString(4, request.getEmail());
        ps.executeUpdate();

        ResultSet resultSet = connection.prepareStatement("select last_insert_rowid()").executeQuery();
        int requestId = resultSet.getInt(1);
        request.setId(requestId);

        for (ChannelRequests channelRequests: request.getChannelRequests()){
            ps = connection.prepareStatement("insert into request_channels(channel_id, request_id) values(?,?)");
            ps.setInt(1, channelRequests.getChannelId());
            ps.setInt(2, request.getId());
            ps.executeUpdate();

            resultSet = connection.prepareStatement("select last_insert_rowid()").executeQuery();
            int requestChannelId = resultSet.getInt(1);

            for (Date requestChannelDate: channelRequests.getDates()){
                ps = connection.prepareStatement("insert into request_channel_days(day, request_channel_id) values (?,?)");
                ps.setString(1, requestChannelDate.toString());
                ps.setInt(2, requestChannelId);
                ps.executeUpdate();
            }
        }
    }
}
