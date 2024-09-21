package com.Coding.arrayCoding.streamapi;

import java.util.List;

public class Stream1 {
   //Given the list of integers, find the first element of the list using Stream functions?

    public static void main(String[] args) {
        List<Integer> list = List.of(4,1,2,7);

      list.stream().findFirst().ifPresent(System.out::println);

    }
}
