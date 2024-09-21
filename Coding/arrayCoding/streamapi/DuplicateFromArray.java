package com.Coding.arrayCoding.streamapi;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateFromArray {
    public static void main(String[] args) {

        List<Integer> list = List.of(2, 1, 5, 5, 1);
        Set<Integer> distinct = new HashSet<>();;

        Set<Integer> duplicate = distinct.stream().
                filter(n->!distinct.add(n)).
                collect(Collectors.toSet());

        System.out.println("Duplicate :"+duplicate);













       /* Set<Integer> duplicated = new HashSet<>();
        Set<Integer> duplicateData = list.stream()
                .filter(n -> !duplicated.add(n)) // Set.add() returns false if the element was already in the set.
                .collect(Collectors.toSet());
        System.out.println("duplicate : "+duplicated);*/
    }

}
