package services.two;

import models.Discount;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DiscountService {
    public void addDiscountsForChannel(List<Discount> discounts) throws SQLException {
        String url = "jdbc:sqlite:/home/nurs/MegaLab/Databases/natv/natv.db";

        Connection connection = DriverManager.getConnection(url);

        PreparedStatement ps = connection.prepareStatement("insert into discounts" +
                "(discount_percent, from_day, id_channel)" +
                "values (?,?,?)");
        for (Discount dis: discounts){
            ps.setInt(1, dis.getPercent());
            ps.setInt(2, dis.getFromDays());
            ps.setInt(3, dis.getIdChannel());
            ps.executeUpdate();
        }

        connection.close();
    }
}
