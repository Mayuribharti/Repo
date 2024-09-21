package com.Coding.arrayCoding.streamapi;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FrquencyOfEachWordInAString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s= scanner.nextLine();

        Map<String, Long> list = Arrays.stream(s.split(" ")).
                collect(Collectors.groupingBy(e->e,Collectors.counting()));


        Map<String, Long> frequency = Arrays.stream(s.split("")).
                collect(Collectors.groupingBy(i->i,Collectors.counting()));



        System.out.println(list);


    }
}
