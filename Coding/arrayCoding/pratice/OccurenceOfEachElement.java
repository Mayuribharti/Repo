package com.Coding.arrayCoding.pratice;

import java.util.ArrayList;
import java.util.List;

public class OccurenceOfEachElement {
    public static void main(String[] args) {
        List<Integer> randomArray = new ArrayList<>(List.of(4, 1, 6, 8, 2, 9, 1, 1, 8));

        for (int i = 0; i < randomArray.size(); i++) {
            int x = randomArray.get(i);
            if (x == -1) {
                continue;
            }

            int count = 0;
            for (int j = 0; j < randomArray.size(); j++) {
                if (x == randomArray.get(j)) {
                    count++;
                    randomArray.set(j, -1); // Mark the element as counted
                }
            }
            if(count<=2) {
                System.out.println(x + " : " + count);
                System.out.println(x);
            }
        }
    }
}
