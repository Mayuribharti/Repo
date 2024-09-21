package com.Coding.arrayCoding.StringProgram;

import java.util.List;

public class MidValueFromList {
    public static void main(String[] args) {
        List<Integer> randomArray= List.of(2,4,5,1,9);

        System.out.println(randomArray.get(randomArray.size() / 2));

    }
}
