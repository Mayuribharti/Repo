package com.Coding.arrayCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenInArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,2,7,4,9};
        System.out.println("Even :");
        for(int i =0 ; i< arr.length ; i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }

        System.out.println("Odd :");
        for(int i =0 ; i< arr.length ; i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }


        //using stream api

         List<Integer> evenList = Arrays.stream(arr)
                 .filter(i -> i % 2 == 0)
                 .boxed()
                 .collect(Collectors.toList());

         List<Integer> oddList = Arrays.stream(arr)
                 .filter(i ->i%2!=0)
                 .boxed()
                 .collect(Collectors.toList());


    }
}
