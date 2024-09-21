package com.Coding.arrayCoding.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AllMethods {
    public static void main(String[] args) {

        // Creating a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 1. filter() - filters elements based on a predicate
        List<Integer> evenData = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("Even Number : " + evenData);


        // 2. map() - applies a function to each element of the stream
        List<Integer> multiplyNumber = numbers.stream().map(i -> i * 2).collect(Collectors.toList());
        System.out.println("MultiplyBy2 : " + multiplyNumber);

        // 3. forEach() - performs an action for each element
        multiplyNumber.stream().forEach(System.out::print);

        // 4. sorted() - sorts the elements of the stream
        List<Integer> randomArray = List.of(2, 7, 9, 3, 1, 6);
        List<Integer> sortedData = randomArray.stream().sorted().collect(Collectors.toList());
        System.out.println("sortedData : " + sortedData);

        // 5. distinct() - returns a stream of distinct elements
        List<Integer> listData = List.of(2, 2, 1, 4, 7, 9);
        List<Integer> distinctData = listData.stream().distinct().collect(Collectors.toList());
        System.out.println("DistinctData : " + distinctData);

        // 6. limit() - truncates the stream to a specified size
        List<Integer> starting3Data = listData.stream().limit(2).collect(Collectors.toList());
        System.out.println("starting2Data :" + starting3Data);

        // 7. skip() - skips a specified number of elements
        List<Integer> skip2Data = listData.stream().skip(2).collect(Collectors.toList());
        System.out.println("skip2Data : "+skip2Data);

        // 8. anyMatch() - checks if any element satisfies the given predicate
        boolean isContainEven = listData.stream().anyMatch(i->i%2==0);
        System.out.println("isContainEven : "+isContainEven);

        // 9. allMatch() - checks if all elements satisfy the given predicate
        boolean isAllEven = listData.stream().allMatch(i->i%2==0);
        System.out.println("isAllEven : "+isAllEven);


        // 10. noneMatch() - checks if no element satisfies the given predicate

        // 11. reduce() - performs a reduction on the elements of the stream
        int sum = listData.stream().reduce(0, Integer::min);
        System.out.println("Sum : "+sum);



    }
}
