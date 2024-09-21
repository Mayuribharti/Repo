package com.Coding.arrayCoding.pratice;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String sChar[]= s.split(" ");
        for(int i =0 ; i<sChar.length; i++){
            String sh = sChar[i];

            for(int j= sh.length(); j>0 ; j-- ){
                System.out.println(sh.charAt(j));
            }
            System.out.print(" ");
        }
    }
}
