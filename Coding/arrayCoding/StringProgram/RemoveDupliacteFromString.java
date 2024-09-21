package com.Coding.arrayCoding.StringProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDupliacteFromString {
    public static void main(String[] args) {
 /*       String s = "Maayyuri";
        char[] c= s.toCharArray();
        String removeDuplicate="";
        char[] removeDupl = new char[0];

        for(int i =0 ; i<c.length ; i++){

            char ch = c[i];
            int count=0;
            if(ch=='0')continue;
            for (int j=0 ; j< c.length ; j++){
                if(ch==c[j]){
                    count++;
                    c[j]='0';
                }
            }
            if(count>=1){
                removeDuplicate= removeDuplicate+ch;
            }
        }
        System.out.println(removeDuplicate);*/


        //2nd way to solve
        String s1 = "haha";
        String s2 = "";
        char c[] = s1.toCharArray();
        Arrays.sort(c);

        s2 = s2 + c[0];
        for(int i =1 ; i< c.length ; i++){
            System.out.println(c[i]+" : "+c[i-1]);
            if(c[i]!=c[i-1]){
                s2=s2+c[i];
            }
        }
        System.out.println(s2);

    }
}
