package com.Coding.arrayCoding.StringProgram;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

   String st[]= s.split(" ");

   for(int i = st.length-1 ; i>=0 ; i--){
       System.out.println(st[i]);
   }


    }
}
