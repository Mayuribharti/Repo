package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapAndFlatMap {
    public static void main(String[] args) {

        //map()
        List<String> RandomArray=List.of("Mayuri","Bittu","Anita","Santosh");
        RandomArray.stream().map(String::toUpperCase).forEach(System.out::println);

        //flatmap()
        List<List<Integer>> months=new ArrayList<>();
        months.add(Arrays.asList(4,5));
        months.add(Arrays.asList(8,9));
        months.add(Arrays.asList(4,6));

        List<Integer> data=months.stream().flatMap(list->list.stream()).distinct().collect(Collectors.toList());
        System.out.println(data);

    }
}
