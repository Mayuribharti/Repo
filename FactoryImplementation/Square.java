package com.FactoryImplementation;

public class Square implements Shape {

    @Override
    public void getShape() {
        System.out.println("....Square.....");
    }
}

class Circle implements Shape {

    @Override
    public void getShape() {
        System.out.println("....Circle.....");
    }
}





