package com.Coding.arrayCoding.streamapi;

import java.util.List;

public class Stream2 {
    // Given a list of integers, find the total number of elements present in the list using 
    // Stream functions?

    public static void main(String[] args) {
        List<Integer> list = List.of(2,1,4,1);
        long sum = list.stream().count();

        System.out.println("Sum :"+sum);
    }


    
}
