package com.Coding.arrayCoding.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class FilterStartingletterWithAandRemaininginUppercase {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "orange", "banana", "graps");

        List<String> element = list.stream().filter(i->!i.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("element :"+element);

    }

}
