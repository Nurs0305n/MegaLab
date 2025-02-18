import java.sql.*;
import java.util.Collection;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(1739282052174L);
        String sDate = date.toString();
        System.out.println(date.toString());
        System.out.println();

        String text = "null1";
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:/home/nurs/MegaLab/Databases/parking.db");
            PreparedStatement ps = connection.prepareStatement("select * from entries");
            ResultSet rs = ps.executeQuery();
            if (rs.next())
                text = rs.getString("start_date");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println(text);
    }
}