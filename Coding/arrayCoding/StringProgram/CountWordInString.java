package com.Coding.arrayCoding.StringProgram;

import java.util.Scanner;

public class CountWordInString {
    public static void main(String[] args) {

        System.out.println("Enter a String : ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String splitString[] = s.split(" ");
        for(int i =0 ; i< splitString.length ; i++){

            String s1= splitString[i];
            if(s1.equalsIgnoreCase("1111"))continue;

            int count=0 ;
            for(int j =0 ; j < splitString.length ; j++){
                if(s1.equalsIgnoreCase(splitString[j])){
                    count++;
                    splitString[j]="1111";
                }
            }
            System.out.println(s1+"   :   "+count);

        }

    }
}
