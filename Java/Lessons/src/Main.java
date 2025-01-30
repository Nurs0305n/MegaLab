import models.*;
import services.StudentService;
import services.TeacherService;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Nursultan", "Tynybekov", "tynybekovn@gmail.com");
        Teacher teacher = new Teacher("Aman", "Asanov");

        TeacherService teacherService = new TeacherService();
        StudentService studentService = new StudentService();

        try {
            teacherService.create(teacher);
            studentService.create(student);

            List<Teacher>  teachers = teacherService.read();
            List<Student> students = studentService.read();

            teacher.setFirstName("Marlen");
            teacherService.update(teacher);

            student.setEmail("boruto200305@gmail.com");
            studentService.update(student);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}