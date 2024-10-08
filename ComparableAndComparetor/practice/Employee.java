package com.ComparableAndComparetor.practice;

import java.util.ArrayList;
import java.util.Collections;

public class Employee {
    int id ;
    String name;
    int age;



    public Employee(int id, String name, int age){
        this.id= id;
        this.name= name;
        this.age=age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Employee>  emp = new ArrayList<>();
        emp.add(new Employee(3,"Mayuri Bharti",23));
        emp.add(new Employee(1,"bobby",21));
        emp.add(new Employee(2,"Rani",12));
      /*  Collections.sort(emp);
        System.out.println(emp);*/

        Collections.sort(emp, new CompartorName());
        System.out.println(emp);
    }

}
