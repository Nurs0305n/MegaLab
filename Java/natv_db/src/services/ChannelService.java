package services;

import models.Channel;
import models.ChannelRequests;

import java.sql.*;
import java.util.List;

public class ChannelService {
    private final String url = "jdbc:sqlite:/home/nurs/MegaLab/Databases/natv/natv.db";

    public ChannelService() throws SQLException {
    }

    public void addNewChannel(Channel channel) throws SQLException {
        String url = "jdbc:sqlite:/home/nurs/MegaLab/Databases/natv/natv.db";

        String sql = "insert into channels(name, price_per_symbol) values (?,?)";

        Connection connection = DriverManager.getConnection(url);

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, channel.getName());
        preparedStatement.setDouble(2, channel.getPricePerSymbol());
        preparedStatement.executeUpdate();

        preparedStatement = connection.prepareStatement("select last_insert_rowid()");
        ResultSet resultSet = preparedStatement.executeQuery();

        int channelId = resultSet.getInt(1);
        channel.setId(channelId);
        connection.close();
    }

    public List<Channel> getChannels() throws SQLException {
    Connection connection = DriverManager.getConnection(url);
    PreparedStatement ps = connection.prepareStatement("select channel_id, name, price_per_percent from channels");
    ResultSet resultSet = ps.executeQuery();
        return List.of();
    }
}
