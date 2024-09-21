package com.Coding.arrayCoding.streamapi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListToMapExample {
    public static void main(String[] args) {

        List<Integer> integerList= List.of(4,1,2,2);
        Map<Integer,Integer> map=IntStream.range(0,integerList.size())
                .boxed()
                .collect(Collectors.toMap(
                        index->index,integerList::get));

        System.out.println(map);
    }
}
