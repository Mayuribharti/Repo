package com.Coding.arrayCoding.pratice;

import java.util.List;

public class maximum {
    public static void main(String[] args) {
        List<Integer> randomList = List.of(3, 5, 1, 8, 9, 6);

        int max= randomList.get(0), min = randomList.get(0);

        for (int i = 1; i < randomList.size(); i++) {
            if (randomList.get(i) < min) {
                min = randomList.get(i);
            }

            if (randomList.get(i) > max) {
                max = randomList.get(i);
            }
        }
        System.out.println("Max : "+max+"\nmin : "+min);
    }
}
