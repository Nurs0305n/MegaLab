package services;

import config.DbConfig;
import models.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentService {

    public void createStudent(Student student) throws SQLException {
        Connection connection = DriverManager.getConnection(DbConfig.url);
        PreparedStatement ps = connection.prepareStatement("insert into students(first_name, last_name, email) values (?,?,?)");
        ps.setString(1, student.getFirstName());
        ps.setString(2, student.getLastName());
        ps.setString(3, student.getEmail());
        ps.executeUpdate();

        ResultSet resultSet = connection.prepareStatement("select last_insert_rowid()").executeQuery();
        int studentId = resultSet.getInt(1);
        
        student.setId(studentId);
        
        resultSet.close();
        ps.close();
        connection.close();
    }

    public List<Student> getStudents() throws SQLException {
        List<Student>  students = new ArrayList<>();
        Connection connection = DriverManager.getConnection(DbConfig.url);
        PreparedStatement ps = connection.prepareStatement("select id, first_name, last_name, email from students");
        ResultSet resultSet = ps.executeQuery();
        
        while (resultSet.next()){
            Student student = new Student(
                    resultSet.getInt("id"), 
                    resultSet.getString("first_name"), 
                    resultSet.getString("last_name"), 
                    resultSet.getString("email"));
            students.add(student);   
        }
        ps.close();
        resultSet.close();
        connection.close();
        return  students;
    }

    public void updateStudent(Student student) throws SQLException {
        Connection connection = DriverManager.getConnection(DbConfig.url);
        PreparedStatement ps = connection.prepareStatement("update students set first_name = ?, last_name = ?, email = ?" +
                "where id = ?");
        ps.setString(1, student.getFirstName());
        ps.setString(2, student.getLastName());
        ps.setString(3, student.getEmail());
        ps.setInt(4, student.getId());
        ps.executeUpdate();

        ps.close();
        connection.close();
    }


}
