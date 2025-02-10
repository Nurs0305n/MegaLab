package db;

import models.Region;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RegionDB implements DbHelper<Region, Integer> {
    @Override
    public Region findById(Integer id) {
        return null;
    }

    @Override
    public void insert(Region region) {
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("insert into regions(name) values (?)");
            ps.setString(1, region.getName());
            ps.executeUpdate();
            ps.close();
            close(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Region region) {
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("update regions set name = ? where id = ?");
            ps.setString(1, region.getName());
            ps.setInt(2, region.getId());
            ps.executeUpdate();
            close(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Region> getAll() {
        List<Region> regions = new ArrayList<>();
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("select id, name from regions");
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()){
                Region region = new Region();
                region.setId(resultSet.getInt("id"));
                region.setName(resultSet.getString("name"));
                regions.add(region);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return regions;
    }

    @Override
    public void delete(Integer id) {
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("delete from regions where id = ?");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
