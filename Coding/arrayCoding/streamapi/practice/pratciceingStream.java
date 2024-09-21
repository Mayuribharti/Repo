package com.Coding.arrayCoding.streamapi.practice;

import javax.swing.text.html.Option;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class pratciceingStream {

    public static void main(String[] args) {
        List<Integer> randomList = List.of(4, 5, 2, 6, 2, 4, 8);

        List<Integer> evenList = randomList.stream().filter(i->i%2 == 0).collect(Collectors.toList());
        System.out.println("EvenList :"+evenList);

        List<Integer> distinct = randomList.stream().distinct().collect(Collectors.toList());
        System.out.println("DistinctData : "+distinct);

        List<Integer> sorted = randomList.stream().sorted().collect(Collectors.toList());
        System.out.println("SortedData : "+sorted);

        List<Integer> multipleBy2 = randomList.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println("multipleBy2 :" +multipleBy2);

        List<Integer> limit = randomList.stream().limit(2).collect(Collectors.toList());
        System.out.println("Limit :"+ limit);

        List<Integer> skip = randomList.stream().skip(2).collect(Collectors.toList());
        System.out.println("Skip :"+skip);

        boolean check = randomList.stream().noneMatch(i->i%2==0);
        System.out.println("check : "+check);

        Optional<Integer> sum = randomList.stream().reduce( Integer::sum);
        System.out.println("sum :"+sum);

        Optional<Integer> min = randomList.stream().reduce(Integer :: min);
        System.out.println("Min :"+min);

        Optional<Integer> max = randomList.stream().reduce(Integer::max);
        System.out.println("Max :"+max);


    }

}
