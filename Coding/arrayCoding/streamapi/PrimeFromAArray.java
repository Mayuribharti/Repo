package com.Coding.arrayCoding.streamapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeFromAArray {
    public static void main(String[] args) {
        List<Integer> randomList = List.of(4,1,3,6,12,9,1);
        List<Integer> primeList = randomList.stream()
                .filter(PrimeFromAArray::isPrime)
                .collect(Collectors.toList());
        System.out.println(primeList);
    }

    private static boolean isPrime(Integer number) {
        return IntStream.rangeClosed(2,number/2).noneMatch(i->number%i==0);

    }


}
