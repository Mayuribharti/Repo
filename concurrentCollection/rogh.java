package com.concurrentCollection;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class rogh {
    public static void main(String[] args) {

        // create vector object
        Vector<String> vector = new Vector<String>();

        // populate the vector
        vector.add("1");
        vector.add("2");
        vector.add("3");
        vector.add("6");
        vector.add("5");
        vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");vector.add("5");

        // create a synchronized view
      //  Collection<String> c = Collections.synchronizedCollection(vector);

        for(String i :vector){
            System.out.println(i +" "+Thread.currentThread());
        }

      //  System.out.println("Sunchronized view is :"+c+" "+Thread.currentThread());
    }
}
