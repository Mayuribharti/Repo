package com.Coding.arrayCoding.streamapi;

import java.util.List;
import java.util.Optional;

public class Stream3 {
   //Given a list of integers, find the maximum value element present in it using Stream functions?
    public static void main(String[] args) {
        List<Integer> list1= List.of(4,1,5,2);
        Optional<Integer> max = list1.stream().reduce(Integer::max);
        System.out.println("Max :"+max);
    }
}
