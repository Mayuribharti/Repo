package com.FactoryImplementation;

public class FactoryCall {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShapeDraw("circle");
        shape.getShape();

        Shape shape1 = shapeFactory.getShapeDraw("Square");
        shape1.getShape();



    }
}
