package org.example.java8;

public class Person {

    private String name;
    private String lastName;

    public Person() {
    }

    public Person(Student student) {
        this.name = student.getName();
        this.lastName = student.getLastName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
