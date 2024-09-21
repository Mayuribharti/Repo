package com.FactoryImplementation;

public class ShapeFactory {

    public Shape getShapeDraw(String shapeType){
        if(shapeType==null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }

        if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
