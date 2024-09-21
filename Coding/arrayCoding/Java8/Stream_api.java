package com.Coding.arrayCoding.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_api {
    public static void main(String[] args) {

        List<Integer> randomArray = List.of(1, 5, 3, 2, 4, 8, 5, 6, 10);

        //even no
        List<Integer> even = randomArray.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("Even : " + even);

        //sorted array
        List<Integer> sortedArray = randomArray.stream().sorted().collect(Collectors.toList());
        System.out.println("sortedArray : " + sortedArray);

        Stream<Integer> infiniteStream = Stream.iterate(1, n -> n + 1).
                limit(10);
        //  infiniteStream.forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println(sum);

        List<Integer> squareOfEachNumber = randomArray.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println("squareOfEachNumber : " + squareOfEachNumber);
        // squareOfEachNumber.forEach(System.out::println);

        List<String> names = Arrays.asList("John", "Jane", "Doe");
        List<Integer> nameLengths = names.stream()
                .map(i -> i.length()) //String::length
                .collect(Collectors.toList());

        System.out.println(nameLengths);

        //has even
        boolean hasEven = randomArray.stream().anyMatch(i -> i % 2 == 0);
        System.out.println(hasEven);


        //Each method of Stream api
        List<Integer> numbersData = Arrays.asList(1, 2, 3, 4, 5, 6);

        //1. filter<preficate>
        List<Integer> evendata = numbersData.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("EvenData : " + evendata);

        //2. map()   ....finding square of
        List<Integer> squareData = numbersData.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println("SquareData : "+squareData);

        //3. flatMap() ... 4)distinct()
        List<List<Integer>> multipleData= new ArrayList<>();
        multipleData.add(Arrays.asList(1,2));
        multipleData.add(Arrays.asList(4,7));
        multipleData.add(Arrays.asList(1,3));

        List<Integer> uniqueFlatteredResult= multipleData.stream().flatMap(List::stream).distinct().collect(Collectors.toList());
        System.out.println("uniqueFlatteredResult : "+uniqueFlatteredResult);

        //5. sorted()
        List<Integer> sortedData = randomArray.stream().sorted().collect(Collectors.toList());
        System.out.println("SortedData : "+sortedData);

        //6. reduce()
        Optional<Integer> sumcount = randomArray.stream().reduce(Integer::sum);
        System.out.println("SumCount : "+sumcount);

        //7. forEach
        System.out.println("forEach");
        randomArray.stream().map(i->i+1).forEach(System.out::println);


        //8. range
        System.out.println("Range");
        IntStream rangeStream = IntStream.range(2,6);
        rangeStream.forEach(System.out::println);

        //9.anyMatch
        boolean hasEvenData = randomArray.stream().anyMatch(i->i%2==0);
        System.out.println("hasEvenData : "+hasEvenData);

        //Prime Number program
      /*  int n = 5;

        boolean isPrime= IntStream.range(2,n/2).noneMatch(i->n%i==0);
        if(isPrime){
            System.out.println(n+" : is prime");
        }else{
            System.out.println(n+" : is not prime");
        }*/


        System.out.println("Prime data");
        randomArray.stream().filter(Stream_api::primeData).forEach(System.out::println);

        List<String> demo = List.of("mayuri","hello","sonu","monu");
       List<String> checkk = demo.stream().filter(i->i.startsWith("m")).collect(Collectors.toList());
    }

    private static boolean primeData(Integer number) {
        return IntStream.range(2,number).noneMatch(i->number%i==0);
    }
}
