package com.Java_Eight.MethodConstructor;

public class ClassImplementation {
    public static void main(String[] args) {
        InterfaceClass i= MethodClass::printMethod;
        i.demo();

        MethodClass methodClass = new MethodClass();
        InterfaceClass interfaceClass = methodClass::printData;
        i.demo();
    }
}
