package com.Coding.arrayCoding.StringProgram;

import java.util.Scanner;

public class FrequencyOfEachElement {

    public static void main(String[] args) {

        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] ch = s.toCharArray();

        for(int i =0 ; i<ch.length ; i++){
            char c= ch[i];
            if(c=='4'){
                continue;
            }

            int count=0;
            for(int j =0 ; j< ch.length ; j++){
                if(c==ch[j]){
                    count++;
                    ch[j]='4';
                }
            }
            System.out.println(c + " : "+count);
        }

    }
}
