package com.Java_Eight.MethodConstructor.ConstrutorRef;

public class ClassMethod {
    public static void main(String[] args) {

        InterfaceClass i = Student::new;
        System.out.println(i.getStudent());

    }
}
