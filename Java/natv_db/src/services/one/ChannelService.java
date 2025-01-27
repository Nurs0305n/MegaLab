package services.one;

import models.Channel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ChannelService {

    public void addNewChannel(Channel channel) throws SQLException {
        String url = "jdbc:sqlite:/home/nurs/Megalab/Database/natv/natv.db";

        Connection connection = DriverManager.getConnection(url);

        PreparedStatement ps = connection.prepareStatement("insert into channels" +
                "(name, price_per_symbol)" +
                "values (?,?)");
        ps.setString(1, channel.getName());
        ps.setDouble(2, channel.getPricePerSymbol());
        ps.executeUpdate();

        connection.close();
    }

}
