package com.Coding.arrayCoding.pratice;

import java.util.ArrayList;
import java.util.List;

public class eventhenodd {

    public static void main(String[] args) {

        List<Integer> randomList = List.of(5, 2, 9,4, 17, 5, 6,1);
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < randomList.size(); i++) {
            if (randomList.get(i) % 2 == 0) {
                even.add(randomList.get(i));
            } else {
                odd.add(randomList.get(i));
            }

        }

        for (int i = 0; i < even.size(); i++) {
            list.add(even.get(i));
        }
        for (int i = 0; i < odd.size(); i++) {
            list.add(odd.get(i));
        }

        System.out.println("List :"+list);
    }
}
