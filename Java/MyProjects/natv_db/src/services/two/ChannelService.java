package services.two;

import models.Channel;

import java.sql.*;

public class ChannelService {

    public void addNewChannel(Channel channel) throws SQLException {
        String url = "jdbc:sqlite:/home/nurs/MegaLab/Databases/natv/natv.db";

        Connection connection = DriverManager.getConnection(url);

        PreparedStatement ps = connection.prepareStatement("insert into channels" +
                "(name, price_per_symbol)" +
                "values (?,?)");
        ps.setString(1, channel.getName());
        ps.setDouble(2, channel.getPricePerSymbol());
        ps.executeUpdate();

        ps = connection.prepareStatement("select last_insert_rowid()");

        ResultSet resultSet = ps.executeQuery();

        int channelId = resultSet.getInt(1);
        channel.setId(channelId);
        connection.close();
    }
}
