package services;

import config.DbConfig;
import models.Flat;
import models.Resident;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlatService {
    private String url = DbConfig.url;

    public void createFlat(Flat flat) throws SQLException {
        Connection connection = DriverManager.getConnection(url);
        PreparedStatement ps = connection.prepareStatement("insert into flats(rooms_count, area, price_per_rents) values (?,?,?)");
        ps.setInt(1, flat.getRoomsCount());
        ps.setInt(2, flat.getArea());
        ps.setInt(3, flat.getPricePerRent());
        ps.executeUpdate();

        ps.close();
        connection.close();
    }

    public List<Flat> getFlats() throws SQLException {
        List<Flat> flats = new ArrayList<>();
        Connection connection = DriverManager.getConnection(url);
        PreparedStatement ps = connection.prepareStatement("select id, rooms_count, area, price_per_percent from flats");
        ResultSet rs = ps.executeQuery();

        while (rs.next()){
            Flat flat = new Flat(rs.getInt("id"), rs.getInt("rooms_count"), rs.getInt("area"), rs.getInt("price_per_rent"));
            flats.add(flat);
        }

        rs.close();
        ps.close();
        connection.close();

        return flats;
    }

    public void setResidents (Flat fLat, List<Resident> residents) throws SQLException {
        Connection connection = DriverManager.getConnection(url);
        PreparedStatement ps = connection.prepareStatement("insert into resident_flats(flat_id, resident_id) values(?,?)");

        for (Resident resident: residents){
            ps.setInt(1, fLat.getId());
            ps.setInt(2, resident.getId());
            ps.executeUpdate();
        }

        ps.close();
        connection.close();
    }


}
