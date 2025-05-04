/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentManagementSystem;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author Alaa
 */
public class DBSetup {

    public static void setup() {
        try {
            Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();

            stmt.execute("CREATE TABLE IF NOT EXISTS students ("
                    + "name TEXT NOT NULL,"
                    + "type TEXT NOT NULL)");

            System.out.println("Table created or already exists.");
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Error during setup: " + e.getMessage());
        }
    }
    public static void setupCourse() {
        try {
            Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();

            stmt.execute("CREATE TABLE IF NOT EXISTS course ("
                    + "subject TEXT NOT NULL,"
                    + "section TEXT NOT NULL)");

            System.out.println("Table created or already exists.");
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Error during setup: " + e.getMessage());
        }
    }

    public static void insertStudent(Student student) {
        String sql = "INSERT INTO students(name, type) VALUES('" + student.getName() + "','" + student.getType() + "')";

        try (Connection conn = DatabaseConnection.getConnection(); Statement stmt = conn.createStatement();) {
            stmt.execute(sql);
            System.out.println("Student inserted: " + student.getName());

        } catch (SQLException e) {
            System.out.println("Insert failed: " + e.getMessage());
        }
    }
    public static void insertCourse(course course) {
        String sql = "INSERT INTO course(subject, section) VALUES('" + course.getName() + "','" + course.getType() + "')";

        try (Connection conn = DatabaseConnection.getConnection(); Statement stmt = conn.createStatement();) {
            stmt.execute(sql);
            System.out.println("Student inserted: " + course.getName());

        } catch (SQLException e) {
            System.out.println("Insert failed: " + e.getMessage());
        }
    }

}
