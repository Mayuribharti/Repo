package com.ComparableAndComparetor;

import java.util.Comparator;
import java.util.stream.Collector;

public class nameStudent implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
