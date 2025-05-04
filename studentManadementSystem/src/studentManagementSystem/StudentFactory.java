/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentManagementSystem;

/**
 *
 * @author Alaa
 */
public class StudentFactory {
    public static Student createStudent(String type, String name) {
        switch (type.toLowerCase()) {
            case "undergraduate": return new Undergraduate(name);
            case "graduate": return new Graduate(name);
            case "parttime": return new PartTime(name);
            default: return null;
        }
    }
}

