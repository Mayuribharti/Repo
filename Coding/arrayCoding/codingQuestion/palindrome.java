package com.Coding.arrayCoding.codingQuestion;

import java.util.Scanner;
import java.util.stream.IntStream;

public class palindrome {
    public static void main(String[] args) {

        System.out.println("Enter an integer :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int palindrome =0;
        int rem;

        System.out.println("palindrome: "+palindrome);

        while(n!=0){
            rem = n%10;
            palindrome =palindrome*10+rem;
            n= n /10;
        }

        System.out.println("Palindrome :"+palindrome);

    }
}
