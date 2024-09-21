package com.Coding.arrayCoding.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class StreamApiPractice {
    public static void main(String[] args) {
         List<Integer> randomList= List.of(3,1,4,2,6,8,9,10,34,8);

         List<Integer> even = randomList.stream().filter(i->i%2==0).collect(Collectors.toList());

         List<Integer> map = randomList.stream().map(i->i*2).collect(Collectors.toList());

         List<Integer> sortedData = randomList.stream().sorted().collect(Collectors.toList());

         List<Integer> distinctElement= randomList.stream().distinct().collect(Collectors.toList());

         boolean containsEven = randomList.stream().anyMatch(i->i%2==0);
        System.out.println(containsEven);


        randomList.stream().forEach(System.out::println );
    }
}
