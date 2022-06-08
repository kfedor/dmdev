package com.github.nutscoding.dmdev.homework.week5.comparator;

import com.github.nutscoding.dmdev.homework.week5.Student;

import java.util.Comparator;
import java.util.stream.Stream;

public class FullNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1 == null || o2 == null){
            return 0;
        }
        int result = o1.getFirstName().compareTo(o2.getFirstName());
        if (result == 0) {
            result = o1.getLastName().compareTo(o2.getLastName());
        }
        return result;
    }
}
