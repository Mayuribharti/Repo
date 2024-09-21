package com.Coding.arrayCoding.streamapi;

import java.util.List;
import java.util.Optional;

public class MaxAndMin {
    public static void main(String[] args) {


        List<Integer> list = List.of(2,1,4,3);

        Optional<Integer> max = list.stream().reduce(Integer::max);

        Optional<Integer> min = list.stream().reduce(Integer::min);

        System.out.println("Max : "+max);
        System.out.println("Min : "+min);

    }
}
