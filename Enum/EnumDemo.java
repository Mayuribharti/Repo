package com.Enum;

public class EnumDemo {

    enum Level {
     LOW,MEDIUM,HIGH

    }
    public static void main(String[] args) {

        System.out.println(Level.LOW);

        for(Level myvar : Level.values()){
            System.out.println(myvar);
        }

    }
}
