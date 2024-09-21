package com.Coding.arrayCoding.codingQuestion;

import java.util.Scanner;
import java.util.stream.IntStream;

public class GCD {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integer: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int Gcd = 0;
        for(int i =2 ; a%i==0 && b%i==0 ; i++){
            Gcd=i;
        }

        System.out.println("GCD of "+a+" , "+b+" : "+Gcd);















/*
       int gcdValue= IntStream.rangeClosed(2, Math.min(a, b))
               .filter(i -> a % i == 0 && b % i == 0)
               .reduce(1, (acc, i) -> i);
        System.out.println("GCD : "+gcdValue);*/



    }
}
