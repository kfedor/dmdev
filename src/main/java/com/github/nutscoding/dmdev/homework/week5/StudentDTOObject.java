package com.github.nutscoding.dmdev.homework.week5;


import java.util.List;

public class StudentDTOObject {

    private List<StudentDTO> listOfStudents;
    private double averageMark;

    public StudentDTOObject(List<StudentDTO> listOfStudents, double averageMark) {
        this.listOfStudents = listOfStudents;
        this.averageMark = averageMark;
    }

    public List<StudentDTO> getListOfStudents() {
        return listOfStudents;
    }

    public double getAverageMark() {
        return averageMark;
    }

    @Override
    public String toString() {
        return "StudentDTOObject{" +
                "listOfStudents=" + listOfStudents +
                ", averageMark=" + averageMark +
                '}';
    }
}
