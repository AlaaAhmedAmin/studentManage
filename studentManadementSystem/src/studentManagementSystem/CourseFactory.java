/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentManagementSystem;

/**
 *
 * @author Alaa
 */
public class CourseFactory {
    public static course createCourse(String type, String name) {
        switch (type.toLowerCase()) {
            case "core": return new CoreCourse(name);
            case "elective": return new ElectiveCourse(name);
            case "lab": return new LabCourse(name);
            default: return null;
        }
    }
}

