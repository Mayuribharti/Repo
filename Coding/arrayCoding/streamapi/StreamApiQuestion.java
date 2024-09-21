package com.Coding.arrayCoding.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class StreamApiQuestion {

    // Given a list of integers, find out all the numbers starting with 1 using Stream functions?

    public static void main(String[] args) {
        List<Integer> list = List.of(11, 43, 24, 15, 19, 67);

        List<String> stringList= list.stream().map(i->i+"")
                .filter(i->i.startsWith("1"))
                .collect(Collectors.toList());
        System.out.println("String list : "+stringList);

    }
}
