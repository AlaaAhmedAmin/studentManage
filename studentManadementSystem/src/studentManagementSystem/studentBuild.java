/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentManagementSystem;

/**
 *
 * @author Alaa
 */
public class studentBuild {
    private String name;
    private int age;
    private String major;
    private double gpa;
    private String status;

    // Private constructor, only accessible through the builder
    private studentBuild(StudentBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.major = builder.major;
        this.gpa = builder.gpa;
        this.status = builder.status;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }
    public String getStatus() {
        return status;
    }

    // Static inner Builder class
    public static class StudentBuilder {

        private String name;
        private int age;
        private String major;
        private double gpa;
        private String status;

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setMajor(String major) {
            this.major = major;
            return this;
        }

        public StudentBuilder setGpa(double gpa) {
            this.gpa = gpa;
            return this;
        }
        public StudentBuilder setStatus(String status) {
            this.status = status;
            return this;
        }

        public studentBuild build() {
            return new studentBuild(this);
        }
    }
    
}
