package com.Coding.arrayCoding.codingQuestion;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("Enter an integer : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int fact =1;
        for(int i =1 ; i<= n ; i++){
            fact = fact * i;
        }

        System.out.println("Factorial : "+fact);

        int factorial = IntStream.rangeClosed(1,n).reduce(1,(i,nn)->i*nn);
        System.out.println(factorial);

    }


}
