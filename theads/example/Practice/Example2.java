package com.theads.example.Practice;

public class Example2 implements Runnable{

    @Override
    public void run() {
        for(int i=0 ; i<10; i++){
          if(i%2==0){
              System.out.println("Even : "+i);
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
        }
    }
}
