package com.Coding.arrayCoding;

import java.util.ArrayList;
import java.util.List;

public class FirstEvenThenOdd {
    public static void main(String[] args) {

        List<Integer> randomList = List.of(4, 6, 9, 1, 18, 12, 4, 5);
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        List<Integer> newArray = new ArrayList<>();

        for (int i = 0; i < randomList.size(); i++) {
            if (randomList.get(0) % 2 == 0) {
                even.add(randomList.get(i));
            } else {
                odd.add(randomList.get(i));
            }
        }

        newArray.addAll(even);
        newArray.addAll(odd);

        System.out.println("EvenThenOdd : " + newArray);

    }
}
