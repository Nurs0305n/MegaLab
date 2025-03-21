package services;

import config.DbConfig;
import models.Teacher;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    public void createTeacher(Teacher teacher) throws SQLException {
        Connection connection = DriverManager.getConnection(DbConfig.url);
        PreparedStatement ps = connection.prepareStatement("insert into teachers(first_name, last_name) values (?,?)");
        ps.setString(1, teacher.getFirstName());
        ps.setString(2, teacher.getLastName());
        ps.executeUpdate();

        ResultSet resultSet = connection.prepareStatement("select last_insert_rowid()").executeQuery();
        int teacherId = resultSet.getInt(1);

        teacher.setId(teacherId);

        resultSet.close();
        ps.close();
        connection.close();
    }

    public List<Teacher> getTeachers() throws SQLException {
        List<Teacher>  teachers = new ArrayList<>();
        Connection connection = DriverManager.getConnection(DbConfig.url);
        PreparedStatement ps = connection.prepareStatement("select id, first_name, last_name from teachers");
        ResultSet resultSet = ps.executeQuery();

        while (resultSet.next()){
            Teacher teacher = new Teacher(resultSet.getInt("id"), resultSet.getString("first_name"), resultSet.getString("last_name"));
            teachers.add(teacher);
        }

        connection.close();
        return teachers;
    }

    public void updateTeacher(Teacher teacher) throws SQLException {
        Connection connection = DriverManager.getConnection(DbConfig.url);
        PreparedStatement ps = connection.prepareStatement("update teachers set first_name = ?, last_name = ? where id = ?");
        ps.setString(1, teacher.getFirstName());
        ps.setString(2, teacher.getLastName());
        ps.setInt(3, teacher.getId());
        ps.executeUpdate();

        connection.close();
    }

    public void deleteTeacherOnId(Teacher teacher) throws SQLException {
        Connection connection = DriverManager.getConnection(DbConfig.url);
        PreparedStatement ps = connection.prepareStatement("delete from teachers " +
                "where id = ?");
        ps.setInt(1, teacher.getId());
        ps.executeUpdate();

        connection.close();
    }

    public void deleteAllTeachers() throws SQLException {
        Connection connection = DriverManager.getConnection(DbConfig.url);
        PreparedStatement ps = connection.prepareStatement("delete from teachers");
        ps.executeUpdate();
        connection.close();
    }


}
