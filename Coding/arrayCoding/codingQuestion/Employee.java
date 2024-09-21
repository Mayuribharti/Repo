package com.Coding.arrayCoding.codingQuestion;

import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    int age;
    String name;

    public Employee(int age, String name){
        this.age=age;
        this.name=name;
    }

    public String getName(){
        return  name;
    }

    public static void main(String[] args) {

        List<Employee> setData= List.of(new Employee(2,"Mayuri"),
                new Employee(1,"Mayank"),
                new Employee(5,"Neha"),
                new Employee(6,"sonu"));

        List<String> names= setData.stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println(names);
    }
}
