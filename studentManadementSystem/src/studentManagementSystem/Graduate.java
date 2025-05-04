/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentManagementSystem;

/**
 *
 * @author Alaa
 */
public class Graduate extends Student {
    public Graduate(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Graduate Student";
    }
    
}
