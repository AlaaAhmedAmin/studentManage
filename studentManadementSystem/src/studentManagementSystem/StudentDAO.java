/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentManagementSystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Alaa
 */
public class StudentDAO {

    public static void getAllStudents() throws SQLException {
        String sql = "SELECT * FROM students";
        Connection conn = DatabaseConnection.getConnection();
        //System.out.println(conn.isClosed());
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
// بعدين تعملي close يدوي بعد ما تخلصي:

            System.out.println("All Students:");
            while (rs.next()) {

                String name = rs.getString("name");
                String type = rs.getString("type");

                System.out.println("Name: " + name + ", Type: " + type);
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            System.out.println("Error reading students: " + e.getMessage());
        }
    }
     public static void getAllCourse() throws SQLException {
        String sql = "SELECT * FROM course";
        Connection conn = DatabaseConnection.getConnection();
        //System.out.println(conn.isClosed());
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
// بعدين تعملي close يدوي بعد ما تخلصي:

            System.out.println("All courses:");
            while (rs.next()) {

                String name = rs.getString("subject");
                String type = rs.getString("section");

                System.out.println("subject: " + name + ", section: " + type);
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            System.out.println("Error reading students: " + e.getMessage());
        }
    }
}
