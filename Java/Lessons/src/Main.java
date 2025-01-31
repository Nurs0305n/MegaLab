import models.*;
import services.LessonService;
import services.StudentService;
import services.TeacherService;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
//            createTeacher();
//            createStudent();
            createLesson();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void createLesson() throws SQLException {
        TeacherService teacherService = new TeacherService();
        StudentService studentService = new StudentService();

        List<Teacher> teachers = teacherService.getTeachers();
        List<Student> students = studentService.getStudents();

        Lesson lesson = new Lesson("Python", teachers.get(0), students);

        LessonService lessonService = new LessonService();
        lessonService.createLesson(lesson);
    }

    private static void createStudent() {
        Student student = new Student("Janysh", "Ashimov", "janysh@gamil.com");
        Student student1 = new Student("Myrza", "Toktomushev", "toktomushev@gamil.com");
        Student student2 = new Student("Baknuras", "Kargaev", "b.kargaev@gamil.com");

        StudentService studentService = new StudentService();

        try {
            studentService.createStudent(student);
            studentService.createStudent(student1);
            studentService.createStudent(student2);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void createTeacher() throws SQLException {
        Teacher teacher = new Teacher("Cholpon", "Abdykalilov");

        TeacherService ts = new TeacherService();

        ts.createTeacher(teacher);

    }
}