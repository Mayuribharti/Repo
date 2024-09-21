package com.Coding.arrayCoding.StringProgram;

import java.util.Scanner;

public class NonRepeatedCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string" );
        String s = scanner.nextLine();
        char ch[]= s.toCharArray();

        for(int i =0 ; i<ch.length ; i++){
            char x = ch[i];
            int count=0;
            if(x=='0'){
                continue;
            }
            for(int j= 0 ; j<ch.length ; j++){
                if(x==ch[j]){
                    count++;
                    ch[j]='0';
                }
            }
            if(count==1){
                System.out.println(x);
            }
        }


    }
}
