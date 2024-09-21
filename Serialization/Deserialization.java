package com.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        try {
            // Creating an ObjectInputStream to read from the serialized file
            FileInputStream fileInputStream = new FileInputStream("obj.text");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            // Reading the Student object from the file
            Student deserializedStudent = (Student) objectInputStream.readObject();

            // Closing the ObjectInputStream
            objectInputStream.close();
            fileInputStream.close();

            // Displaying the deserialized Student object
            System.out.println("Deserialized Student Object:");
            System.out.println("Roll Number: " + deserializedStudent.getId());
            System.out.println("Name: " + deserializedStudent.getName());
            System.out.println("School: " + deserializedStudent.getSchoolName());
        } catch (IOException | ClassNotFoundException e) {
            // Handling exceptions by printing the exception message
            e.printStackTrace();
        }
    }
}
