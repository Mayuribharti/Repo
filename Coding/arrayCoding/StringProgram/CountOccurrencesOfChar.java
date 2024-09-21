package com.Coding.arrayCoding.StringProgram;

import java.util.Scanner;

public class CountOccurrencesOfChar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s = scanner.nextLine();
        char ch ='a';
        int count=0;
        for(int i =0 ; i<s.length() ; i++){
            if(ch==s.charAt(i)){
                count++;
            }
        }
        System.out.println("count : "+count);


    }
}
