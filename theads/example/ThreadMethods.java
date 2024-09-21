package com.theads.example;

public class ThreadMethods {
  /*  public static void main(String[] args) {

        int x = 3+5;
        System.out.println("Sun is : "+x);
        Thread t = Thread.currentThread();
        String threadName = t.getName();
        System.out.println("Thread name : "+threadName);

        t.setName("MyThread");
        String newThreadName = t.getName();
        System.out.println("nee threadName : "+newThreadName);

    }*/


    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for (int i=0; i<10; i++){
            System.out.println(Thread.currentThread());
            sb.append("Tpoint");
        }
        System.out.println(Thread.currentThread());
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");

        StringBuilder sb2 = new StringBuilder("Java");
        for (int i=0; i<10; i++){
            System.out.println(Thread.currentThread());
            sb2.append("Tpoint");
        }

        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
    }

}
