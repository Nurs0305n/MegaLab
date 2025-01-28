package services;

import models.ChannelRequests;
import models.Request;

import java.sql.*;

public class RequestService {
//    private String url = "jdbc:sqlite:/home/nurs/MegaLab/Databases/natv/natv.db"; //Linux
    private String url = "jdbc:sqlite:D:/java/Lesson/MegaLab/Databases/natv/natv.db"; //Windows
    public void createRequest(Request request) throws SQLException {
        Connection connection = DriverManager.getConnection(url);

        PreparedStatement ps = connection.prepareStatement("insert into requests(client_name, request_text, phone_number, email) values (?,?,?,?)");
        ps.setString(1, request.getClientName());
        ps.setString(2, request.getText());
        ps.setString(3, request.getPhoneNumber());
        ps.setString(3, request.getEmail());
        ps.executeUpdate();

        ResultSet resultSet = connection.prepareStatement("select last_insert_rowid()").executeQuery();
        int requestId = resultSet.getInt(1);

        for (ChannelRequests channelRequests: request.getChannelRequests()){
            ps = connection.prepareStatement("");
        }
    }
}
