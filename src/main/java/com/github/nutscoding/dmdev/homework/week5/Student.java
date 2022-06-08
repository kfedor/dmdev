package com.github.nutscoding.dmdev.homework.week5;

import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private int course;
    private List<Integer> listOfMarks;

    public Student(String firstName, String lastName, int course, List<Integer> listOfMarks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.listOfMarks = listOfMarks;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCourse() {
        return course;
    }

    public List<Integer> getListOfMarks() {
        return listOfMarks;
    }

    public boolean hasMoreThanThreeMarks() {
        return listOfMarks.size() > 3;
    }

    public double getStudentAverageMark() {
        return listOfMarks.stream().mapToInt(Integer::intValue).average().getAsDouble();
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course=" + course +
                ", listOfMarks=" + listOfMarks +
                '}';
    }
}
