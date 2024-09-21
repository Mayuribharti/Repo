package com.ListToMap;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ArrayToList {
    public static void main(String[] args) {


        List<Integer> randomArray = Arrays.asList(1, 2, 3, 4, 5);

        // Calculating the sum using Java 8 Stream API
        Optional<Integer> sum = Optional.of(randomArray.stream().mapToInt(Integer::intValue).sum());
        System.out.println(sum);



    }
}
