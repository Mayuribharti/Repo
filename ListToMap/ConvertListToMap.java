package com.ListToMap;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student{
    private Integer id;
    private String name;

    Student(Integer id , String name){
        this.id = id;
        this.name= name;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName(){
        return this.name;
    }
}
public class ConvertListToMap {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"Mayuri"));
        studentList.add(new Student(2,"Reena"));
        studentList.add(new Student(3,"Uma"));
        studentList.add(new Student(4,"neha"));

        Map<Integer,String> mapList = new HashMap<>();

       for(Student su : studentList){
           mapList.put(su.getId(), su.getName());
       }

        System.out.println(mapList);

    }




}
