package com.OOPS.polymorphism;

public class MethodOverriding {
    public void move(){
        System.out.println("Animals can move");
    }
}
class Dogs extends MethodOverriding{
    public void move(){
        System.out.println("Dogs can walk and run");
    }
}
class check{

    public static void main(String[] args) {
        MethodOverriding methodOverriding = new MethodOverriding();
        MethodOverriding dogs = new Dogs();
        Dogs d1 = new Dogs();

        methodOverriding.move();
        dogs.move();
        d1.move();


      /*  Object Type: Dogs
        Reference Type: MethodOverriding*/
    }
}
