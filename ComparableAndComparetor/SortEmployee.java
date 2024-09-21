package com.ComparableAndComparetor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortEmployee {
    public static void main(String[] args) {

        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1,"Mayuri",23));
        emp.add(new Employee(7,"Mayank",28));
        emp.add(new Employee(2,"neha",30));
        Collections.sort(emp);

        //comparable
        System.out.println(emp);


        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1,"monu",20));
        students.add(new Student(9,"Anu",15));
        students.add(new Student(5,"Dheraj",44));
        Collections.sort(students,new IdStudent());


        Collections.sort(students,new nameStudent());
        System.out.println(students);

    }
}
