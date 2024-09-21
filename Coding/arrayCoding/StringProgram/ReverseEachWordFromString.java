package com.Coding.arrayCoding.StringProgram;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.Vector;

public class ReverseEachWordFromString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

       String sSplit[] = s.split(" ");
       for(int i =0 ; i< sSplit.length ; i++){
           String ch = sSplit[i];

           for(int j= ch.length()-1 ; j >=0 ; j--){
               System.out.print(ch.charAt(j));
           }
           System.out.print(" ");
       }
    }

}