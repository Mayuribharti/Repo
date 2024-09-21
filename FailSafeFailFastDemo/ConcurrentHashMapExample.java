package com.FailSafeFailFastDemo;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {

        ConcurrentHashMap<Integer,String> ageAndName = new ConcurrentHashMap<>();
        ageAndName.put(12,"Priya");
        ageAndName.put(15,"lata");
        ageAndName.put(16,"mohini");

        ageAndName.replace(15,"lata","pinky");

        ageAndName.forEach((key,value)-> System.out.println(key+" "+value));


    }
}
