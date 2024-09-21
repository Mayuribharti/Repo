package com.Serialization;

import java.io.FileOutputStream;
import java.io.Serializable;

public class Student implements Serializable {

    int id;
    String name;
    String schoolName;

    Student(int id, String name, String schoolName) {
        this.id = id;
        this.name = name;
        this.schoolName = schoolName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSchoolName() {
        return schoolName;
    }

}
