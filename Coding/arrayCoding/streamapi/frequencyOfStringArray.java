package com.Coding.arrayCoding.streamapi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class frequencyOfStringArray {
    public static void main(String[] args) {


        List<String> randomString = List.of("may","may","bha","ranu");

        Map<String,Long> frequency = randomString.stream().
                collect(Collectors.groupingBy(i->i,Collectors.counting()));

        System.out.println("Frequency :"+frequency);

    }
}
