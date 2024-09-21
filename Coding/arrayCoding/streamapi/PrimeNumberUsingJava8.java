package com.Coding.arrayCoding.streamapi;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumberUsingJava8 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

      boolean prime = IntStream.rangeClosed(2,n/2).noneMatch(i->n%i==0);
      if(prime){
          System.out.println("Prime");
      }else{
          System.out.println("Not prime");
      }

















/*
        boolean isPrime = IntStream.rangeClosed(2,n/2).anyMatch(i->n%i==0);
        if(isPrime){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }*/
    }
}
