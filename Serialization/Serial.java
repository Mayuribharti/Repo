package com.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {

    public static void main(String[] args) {
        try {
            // Creating a Student object
            Student student = new Student(3, "Mayuri", "K.V.Sarni");

            // Creating a FileOutputStream to write the object to a file named "obj.text"
            FileOutputStream fileOutputStream = new FileOutputStream("obj.text");

            // Creating an ObjectOutputStream to serialize and write the object to the file
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // Writing the Student object to the file
            objectOutputStream.writeObject(student);

            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Student object successfully written to obj.txt");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
