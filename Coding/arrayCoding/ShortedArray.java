package com.Coding.arrayCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ShortedArray {

    public static void main(String[] args) {

        //using selection sort
        /*
 Selection Sort works by repeatedly finding the smallest (or largest, depending on the sorting order)
 element from the unsorted part of the array and putting it at the beginning. This process continues
 until the entire array is sorted. It's like repeatedly finding the smallest card in a deck and placing it
 at the front until the whole deck is sorted.
        * */

        int arr[] = {7, 8, 3, 5, 9};
        for(int i =0 ; i< arr.length ; i++){

            int temp;
            for(int j= i+1 ; j< arr.length ; j++){
                if(arr[j]<arr[i]){
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }

            }
        }

        for(int i =0 ;i < arr.length ; i++){
            System.out.println(arr[i]);
        }

    }


   /* How It Works
   1. First Pass (i = 0):
      Compares arr[0] with arr[1], arr[2], ..., arr[6] and moves the smallest element to arr[0].

   2. Second Pass (i = 1):
      Compares arr[1] with arr[2], arr[3], ..., arr[6] and moves the next smallest element to arr[1].*/









    /*
        //Using stream api
        List<Integer> sortedArray =Arrays.stream(arr).sorted()
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Sorted Array : "+sortedArray);
    }*/

}
