package com.theads.example.daemonThread;

public class DaemonThread extends Thread {


    @Override
    public void run() {
       if(Thread.currentThread().isDaemon()){
           System.out.println("Its a daemon thread");
       }
       else{
           System.out.println("Its a user thread");
        }
    }

    public static void main(String[] args) {
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);
        daemonThread.start();
    }

}