package com.theads.example.theadQuestion;

public class Practice implements Runnable{
    @Override
    public void run() {

        for(int i =1 ; i <=5 ; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Practice practice = new Practice();
        Thread thread = new Thread(practice);
        thread.start();
    }


}
