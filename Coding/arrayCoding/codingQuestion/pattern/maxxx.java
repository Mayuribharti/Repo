package com.Coding.arrayCoding.codingQuestion.pattern;

import java.util.Arrays;

public class maxxx {
    public static void main(String[] args) {

        int arr[] = {9, 4, 3, 5, 4, 4, 3};

        String s = "";

        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];

            if (x == -1)
                continue;

            int count = 0;
            for (int j = 0; j < arr.length; j++) {

                if (x == arr[j]) {
                    count++;
                    arr[j] = -1;
                }
            }

            if (count >= 1) {
                s = s + x;
            }
        }

        char ch[] = s.toCharArray();
        Arrays.sort(ch);
//      int arr[] = {3,4,5,9};
        System.out.println(ch.length);
        System.out.println(ch.length-1);
        System.out.println(" ");
        for(int i =0 ; i< ch.length ;i++){
            System.out.println(i+" : "+ch[i]);
        }
        System.out.println(ch[ch.length-1]);
                            //ch[4-1]
                            //ch[3]=9
    }
}



