/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentManagementSystem;

/**
 *
 * @author Alaa
 */
public abstract class course {
    protected String name;

    public course(String name) {
        this.name = name;
    }

    public abstract String getType();

    public String getName() {
        return name;
    }
}
class CoreCourse extends course {
    public CoreCourse(String name) {
        super(name);
    }

    public String getType() {
        return "Core Course";
    }
}
class ElectiveCourse extends course {
    public ElectiveCourse(String name) {
        super(name);
    }

    public String getType() {
        return "Elective Course";
    }
}
class LabCourse extends course {
    public LabCourse(String name) {
        super(name);
    }

    public String getType() {
        return "Lab Course";
    }
}