package services;

import config.DbConfig;
import models.Region;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RegionService {
    private String url = DbConfig.url;

    public void createRegion(Region region) throws SQLException {
        Connection connection = DriverManager.getConnection(url);
        PreparedStatement ps = connection.prepareStatement("insert into (name) values(?)");
        ps.setString(1, region.getName());
        ps.executeUpdate();

        ps.close();
        connection.close();
    }

    public List<Region> getRegions() throws SQLException {
        List<Region> regions = new ArrayList<>();
        Connection connection = DriverManager.getConnection(url);
        PreparedStatement ps = connection.prepareStatement("select id, name from regions");
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            Region region = new Region(rs.getInt("id"), rs.getString("name"));
            regions.add(region);
        }

        rs.close();
        ps.close();
        connection.close();

        return regions;
    }

    public void updateRegion (Region region) throws SQLException {
        Connection connection = DriverManager.getConnection(url);
        PreparedStatement ps = connection.prepareStatement("update regions set name = ? where id = ?");
        ps.setString(1, region.getName());
        ps.setInt(2, region.getId());
        ps.executeUpdate();

        ps.close();
        connection.close();
    }
}
