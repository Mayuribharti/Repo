package com.Coding.arrayCoding.StringProgram;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        System.out.println("Enter an String : ");
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        String rev = "";

        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            rev= ch+rev;
        }

        System.out.println(rev);



    }
}