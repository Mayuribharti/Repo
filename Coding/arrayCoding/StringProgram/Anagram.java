package com.Coding.arrayCoding.StringProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static char[] sort(char[] ch){
        for(int i =0 ; i< ch.length ; i++){
                    char temp;
            for(int j= 1+i ; j<ch.length ; j++){
                if(ch[i]>ch[j]){
                    temp = ch[i];
                    ch[i]= ch[j];
                    ch[j]= temp;

                }
            }
        }
        return ch;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st String : ");
        String s1 = scanner.nextLine();
        System.out.println("Enter 2nd String : ");
        String s2 = scanner.nextLine();

        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();

        int count1=0;
        for(int i =0 ; i< s1.length() ; i++){
            if(s1.charAt(i)!=' '){
                count1++;
            }
        }

        int count2 =0;
        for(int i =0 ; i<s2.length() ; i++){
            if(s2.charAt(i)!=' '){
                count2++;
            }
        }

        char sortedString1[]=sort(ch1);
        char sortedString2[]=sort(ch2);


        boolean result = Arrays.equals(sortedString1,sortedString2);
        if(result==true){
            System.out.println("Anagram");
        }else{
            System.out.println("Not an Anagram");
        }


    }
}
