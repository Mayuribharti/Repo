package com.OOPS.inheritance.multipleInheritance;

public class Single {
    public static void hello(){
        System.out.println("hahhaha");
    }
}

class Second extends Single{
    public static void main(String[] args) {

        Second second = new Second();
        second.hello();

    }
}
