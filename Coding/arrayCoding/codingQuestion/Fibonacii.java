package com.Coding.arrayCoding.codingQuestion;

import java.util.Scanner;

public class Fibonacii {

    public static void main(String[] args) {

        System.out.println("Enter an integer : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;
        System.out.println(a+"\n"+b);
        int c;
     for(int i =2 ; i <n ; i++){
            c = a+b;
            System.out.println(c);
            a= b;
            b= c;
        }



    }
}