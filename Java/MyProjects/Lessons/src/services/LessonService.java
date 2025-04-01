package services;

import config.DbConfig;
import models.Lesson;
import models.Student;

import java.sql.*;

public class LessonService {

    public void createLesson(Lesson lesson) throws SQLException {
        Connection connection = DriverManager.getConnection(DbConfig.url);
        PreparedStatement ps = connection.prepareStatement("insert into lessons(name, teacher_id) values (?,?)");
        ps.setString(1,lesson.getName());
        ps.setInt(2, lesson.getTeacher().getId());
        ps.executeUpdate();

        ps = connection.prepareStatement("select last_insert_rowid()");
        ResultSet resultSet = ps.executeQuery();
        int lessonId = resultSet.getInt(1);
        resultSet.close();

        ps = connection.prepareStatement("insert into student_lessons(lesson_id, student_id) values (?,?)");
        for (Student student: lesson.getStudents()) {
            ps.setInt(1, lessonId);
            ps.setInt(2, student.getId());
            ps.executeUpdate();
        }
    }
}
