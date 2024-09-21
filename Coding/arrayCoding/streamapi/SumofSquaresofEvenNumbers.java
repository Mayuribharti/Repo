package com.Coding.arrayCoding.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class SumofSquaresofEvenNumbers {
    public static void main(String[] args) {

        List<Integer> list = List.of(3,1,2,4);

     int sum_of_square_of_even_number = list.stream().filter(i->i%2==0)
                     .mapToInt(i->i*i)
                             .sum();

        System.out.println("sum of square of even number :"+sum_of_square_of_even_number);



    }
}
