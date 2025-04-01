package services;

import config.DbConfig;
import models.Resident;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ResidentService {
    private String url = DbConfig.url;

    public void createResident (Resident resident) throws SQLException {
        Connection connection = DriverManager.getConnection(url);
        PreparedStatement ps = connection.prepareStatement("insert into residents(first_name, last_name) values (?,?)");
        ps.setString(1, resident.getFirstName());
        ps.setString(2, resident.getLastName());
        ps.executeUpdate();

        ps.close();
        connection.close();
    }

    public List<Resident> getResidents() throws SQLException {
        List<Resident> residents = new ArrayList<>();
        Connection connection = DriverManager.getConnection(url);
        PreparedStatement ps = connection.prepareStatement("select id, first_name, last_name values (?,?,?)");
        ResultSet rs = ps.executeQuery();

        while (rs.next()){
            Resident resident = new Resident(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"));
            residents.add(resident);
        }

        rs.close();
        ps.close();
        connection.close();

        return residents;
    }

    public void updateResident(Resident resident) throws SQLException {
        Connection connection = DriverManager.getConnection(url);
        PreparedStatement ps = connection.prepareStatement("update residents set first_name = ?, last_name = ? where id = ?");
        ps.setString(1, resident.getFirstName());
        ps.setString(2, resident.getLastName());
        ps.setInt(3, resident.getId());
        ps.executeUpdate();

        ps.close();
        connection.close();
    }
}
