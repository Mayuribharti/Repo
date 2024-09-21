package com.theads.example;

public class MyThread implements Runnable {

    @Override
    public  void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println("The value of i is : " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();

        RunThread runThread = new RunThread();
        runThread.start();
    }
}
