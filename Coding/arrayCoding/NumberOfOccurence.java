package com.Coding.arrayCoding;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfOccurence {
    public static void main(String[] args) {

        System.out.println("Enter an integer :");
        Scanner scanner = new Scanner(System.in);

        int arr[] = {7, 2, 1, 3, 1, 7, 8, 7};

        for (int i = 0; i < arr.length; i++) {
            int x= arr[i];

            if(x==-1)continue;

            int count =0 ;
           for(int j =0 ; j < arr.length ; j++){
            if(x== arr[j]){
                count++;
                arr[j]=-1;
            }
           }
            System.out.println(x+" : "+count);
        }

    /*    //Using stream api
        long i = Arrays.stream(array).filter(j->j==n).count();
        System.out.println(n+" count : "+count);*/
    }
}
