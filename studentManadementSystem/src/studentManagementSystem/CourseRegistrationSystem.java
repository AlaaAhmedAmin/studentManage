package studentManagementSystem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

/**
 *
 * @author Alaa
 */
public class CourseRegistrationSystem {
     private static CourseRegistrationSystem instance;
    private Map<String, List<String>> enrollments = new HashMap<>();

    private CourseRegistrationSystem() {}

    public static CourseRegistrationSystem getInstance() {
        if (instance == null) {
            instance = new CourseRegistrationSystem();
        }
        return instance;
    }

    public void register(String studentId, String courseCode) {
        enrollments.putIfAbsent(studentId, new ArrayList<>());
        enrollments.get(studentId).add(courseCode);
    }

    public List<String> getEnrollments(String studentId) {
        return enrollments.getOrDefault(studentId, new ArrayList<>());
    }
}

