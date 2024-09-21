package com.theads.example.Practice;

public class Example extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.println("odd:"+i);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Example e = new Example();
        e.start();

        Example2 example2 = new Example2();
        Thread thread = new Thread(example2);
        thread.start();

    }
}
