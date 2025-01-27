package services;

import models.Channel;

import java.sql.*;

public class ChannelService {

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
}
