/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentManagementSystem;
 import java.util.*;
/**
 *
 * @author Alaa
 */
public class GradeProcessingSystem {
  private static GradeProcessingSystem instance;
    private Map<String, Map<String, Integer>> grades = new HashMap<>();

    private GradeProcessingSystem() {}

    public static GradeProcessingSystem getInstance() {
        if (instance == null) {
            instance = new GradeProcessingSystem();
        }
        return instance;
    }

    public void addGrade(String studentId, String courseCode, int grade) {
        grades.putIfAbsent(studentId, new HashMap<>());
        grades.get(studentId).put(courseCode, grade);
    }

    public double getGPA(String studentId) {
        Map<String, Integer> studentGrades = grades.get(studentId);
        if (studentGrades == null || studentGrades.isEmpty()) return 0.0;
        int total = 0;
        for (int grade : studentGrades.values()) {
            total += grade;
        }
        return total / (double) studentGrades.size();
    }
}   

