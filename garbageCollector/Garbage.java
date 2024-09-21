package com.garbageCollector;

public class Garbage {

    public void finalize(){
        System.out.println("Garbage Collection");
        // the garbage collector runs and reclaims the objects, the finalize
        // method will be called, and the message "Garbage Collection" will be printed.
    }
    public static void main(String[] args) {


        String n = null;
        Garbage g1 = new Garbage();
        Garbage g2 = new Garbage();

        g1=null;
        g2=null;


        System.gc();
        //The System.gc() method is called to suggest to the Java
        // Virtual Machine (JVM) that it should run the garbage collector.
    }
}
