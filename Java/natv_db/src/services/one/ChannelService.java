package services.one;

import models.Channel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ChannelService {
    private final String url = "jdbc:sqlite:/home/nurs/MegaLab/Databases/natv/natv.db"; //Linux
//    private final String url = "jdbc:sqlite:D:/Java/Lessons/MegaLab/Databases/natv/natv.db"; //Windows

    public void addNewChannel(Channel channel) throws SQLException {
        Connection connection = DriverManager.getConnection(url);

        PreparedStatement ps = connection.prepareStatement("insert into channels" +
                "(name, price_per_symbol)" +
                "values (?,?)");
        ps.setString(1, channel.getName());
        ps.setDouble(2, channel.getPricePerSymbol());
        ps.executeUpdate();

        connection.close();
    }

    public List<Channel> getChannels() throws SQLException {
        List<Channel> channels = new ArrayList<>();

        Connection connection = DriverManager.getConnection(url);
        PreparedStatement ps = connection.prepareStatement("Select id, name, price_per_symbol from channels");
        ResultSet resultSet = ps.executeQuery();

        while (resultSet.next()){
            Channel channel = new Channel(resultSet.getInt(1), resultSet.getString(2), resultSet.getDouble(3));
            channels.add(channel);
        }
        for (Channel channel: channels){
            System.out.printf("Индекс: %d, Название канала: %s, Цена за символ: %.2f%n", channel.getId(), channel.getName(), channel.getPricePerSymbol());
        }
        connection.close();
        return channels;
    }
}
