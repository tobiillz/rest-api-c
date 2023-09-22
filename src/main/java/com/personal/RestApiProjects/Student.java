package com.personal.RestApiProjects;

public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private String level;

    public Student(String firstName, String lastName, int age, String level) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.level = level;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}

