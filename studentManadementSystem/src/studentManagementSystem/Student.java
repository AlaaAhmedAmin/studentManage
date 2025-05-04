/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentManagementSystem;

/**
 *
 * @author Alaa
 */
public abstract class Student implements Cloneable {
    protected String name;

    public Student(String name) {
        this.name = name;
    }

    public abstract String getType();

    public String getName() {
        return name;
    }

    @Override
    public Student clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}

