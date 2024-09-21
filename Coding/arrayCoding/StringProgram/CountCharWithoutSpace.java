package com.Coding.arrayCoding.StringProgram;

import java.util.Scanner;

public class CountCharWithoutSpace {
    public static void main(String[] args) {

        System.out.println("Enter a String : ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int count=0;
        for(int i =0 ; i<s.length() ; i++){
            if(s.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println("Count :"+count);
    }
}
