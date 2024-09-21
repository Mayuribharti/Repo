package com.concurrentCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class NonThreadSafeExample {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Five");

        Runnable t1 = () -> {
            for(String str : list){
                System.out.println(str);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable t2 = () -> {
            list.add("six");
            list.add("seven");
        };

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread2.start();
        thread1.start();

    }
}
