package com.Coding.arrayCoding.pratice;

import java.util.Scanner;

public class CountEachWordInAString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String[] splitS = s.split(" ");

        for(int i =0 ; i<splitS.length ; i++){
            String s1 = splitS[i];
            if(s1.equals("1111")){
                continue;
            }

            int count=0 ;
            for(int j =0 ; j< splitS.length ; j++){
                if(s1.equals(splitS[j])){
                    count++;
                    splitS[j]="1111";
                }
            }
            System.out.println(s1+" : "+count);
        }
    }
}
