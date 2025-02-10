package db;

import models.Position;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PositionDB implements DbHelper<Position, Integer>{
    @Override
    public void insert(Position position) {
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("insert into positions(name, max_salary, department_id) values (?,?,?)");
            ps.setString(1, position.name());
            ps.setDouble(2, position.maxSalary());
            ps.setInt(3, position.department().id());
            ps.executeUpdate();

            ps.close();
            close(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Position position) {
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("update positions set name = ?, max_salary = ?, department_id = ? where id = ?");
            ps.setString(1, position.name());
            ps.setDouble(2, position.maxSalary());
            ps.setInt(3, position.department().id());
            ps.setInt(4, position.id());
            ps.executeUpdate();

            ps.close();
            close(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Position> getList() {
        List<Position> positions = new ArrayList<>();

        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("select id, name, max_salary, department_id from positions");
            ResultSet resultSet = ps.executeQuery();

            while(resultSet.next()){
//                Position position = new Position(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getDouble("max_salary"), resultSet.getInt("deparmet_id"));
//                positions.add(position);
            }

            resultSet.close();
            ps.close();
            close(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return positions;
    }

    @Override
    public void delete(Integer id) {
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("delete from positions where id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();
            close(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Position getById(Integer id) {
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("select id, name, max_salary, department_id from positions where id = ?");
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
//                Position position = new Position(rs.getInt("id"), rs.getString("name"), rs.getDouble("max_salary"), rs.getInt("department_id"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
