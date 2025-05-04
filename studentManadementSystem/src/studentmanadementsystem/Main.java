/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanadementsystem;

import com.sun.jdi.connect.spi.Connection;
import java.sql.SQLException;
import studentManagementSystem.CourseFactory;
import studentManagementSystem.CourseRegistrationSystem;
import studentManagementSystem.DBSetup;
import studentManagementSystem.DatabaseConnection;
import studentManagementSystem.GradeProcessingSystem;
import studentManagementSystem.Student;
import studentManagementSystem.StudentDAO;
import studentManagementSystem.StudentFactory;
import studentManagementSystem.course;
import studentManagementSystem.studentBuild;

/**
 *
 * @author Alaa
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        studentBuild student_1 = new studentBuild.StudentBuilder()
                .setName("Alice Johnson")
                .setAge(20)
                .setMajor("Computer Science")
                .setGpa(3.8)
                .setStatus("undergraduate")
                .build();
        studentBuild student_2 = new studentBuild.StudentBuilder()
                .setName("Alice Johnson")
                .setAge(20)
                .setMajor("Computer Science")
                .setGpa(3.8)
                .setStatus("graduate")
                .build();
        // إنشاء طلاب
        Student student1 = StudentFactory.createStudent(student_1.getStatus(), student_1.getName());
        Student student2 = StudentFactory.createStudent(student_2.getStatus(), student_2.getName());

        course course1 = CourseFactory.createCourse("core", "Math 101");
        course course2 = CourseFactory.createCourse("lab", "Physics Lab");

        CourseRegistrationSystem regSystem = CourseRegistrationSystem.getInstance();
        regSystem.register("S001", course1.getName());
        regSystem.register("S001", course2.getName());

        System.out.println(student1.getName() + "'s Enrolled Courses: " + regSystem.getEnrollments("S001"));

        GradeProcessingSystem gradeSystem = GradeProcessingSystem.getInstance();
        gradeSystem.addGrade("S001", course1.getName(), 90);
        gradeSystem.addGrade("S001", course2.getName(), 80);

        System.out.println(student1.getName() + "'s GPA: " + gradeSystem.getGPA("S001"));

        Student original = StudentFactory.createStudent("undergraduate", "Alice");
        Student cloned = original.clone();

        System.out.println("Original: " + original.getName() + " - " + original.getType());
        System.out.println("Cloned: " + cloned.getName() + " - " + cloned.getType());
        //DBSetup.setup();
        DBSetup.setupCourse();
        //DBSetup.insertStudent(student1);
        DBSetup.insertCourse(course2);
        //StudentDAO.getAllStudents();
        StudentDAO.getAllCourse();
    }
}
