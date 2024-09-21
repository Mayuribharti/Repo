package com.Coding.arrayCoding.streamapi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfEachElement {
    public static void main(String[] args) {

        List<Integer> randomList = List.of(4, 7, 1, 2, 1, 4, 9);

        Map<Integer,Long> frequency = randomList.stream()
                .collect(Collectors.groupingBy(i->i,Collectors.counting()));

    }
}
