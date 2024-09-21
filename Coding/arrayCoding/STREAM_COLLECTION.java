package com.Coding.arrayCoding;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class STREAM_COLLECTION {


    public static void main(String[] args) {

        //1. filter (predicate)
        System.out.println();
        List<String> names = List.of("Sapna", "Prachi", "Priya", "Heena", "Uma");
        List<String> namedata = names.stream().filter(n -> n.length() >= 4).collect(Collectors.toList());
        System.out.println("nameData : " + namedata);

        //2. RangeClosed
        System.out.println();
        System.out.println("RangeClosed");
        IntStream.rangeClosed(1, 5).forEach(System.out::println);

        //3.Range
        System.out.println();
        System.out.println("Range");
        IntStream.range(1, 5).forEach(System.out::println);

        //4.Distinct
        System.out.println();
        System.out.println("Distinct");
        List<Integer> randomList = List.of(2, 5, 71, 8, 3, 3, 1, 9, 1);
        List<Integer> distinct = randomList.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct Data :" + distinct);

        //5.sorted
        System.out.println();
        System.out.println("Sorted");
        List<Integer> sortedList = randomList.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted Data :" + sortedList);


        //find Even Number in a list
        System.out.println();
        System.out.println("Even Number from a List :");
        List<Integer> evenNumber = randomList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("EvenNumber : " + evenNumber);

        //find prime Number
        System.out.println();
        System.out.println("Find Prime :");
        int n = 7;
        boolean check = IntStream.rangeClosed(2, n / 2).noneMatch(i -> n % i == 0);
        if (check) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is not Prime");
        }

        //Find Prime Number from a List
        System.out.println();
        List<Integer> randomArray = List.of(2, 4, 5, 7, 8, 9, 10, 13);
        List<Integer> PrimeList = randomList.stream().filter(STREAM_COLLECTION::isPrime).collect(Collectors.toList());
        System.out.println("Prime List : " + PrimeList);

        //Not Done
        //Find duplicate from a list
        System.out.println();
        System.out.println("Duplicate List : ");
        //   List<Integer> duplicate = randomArray.stream().filter().collect(Collectors.toList());

        //Max,min,avg from list
        System.out.println();
        System.out.println("Max and Min");
        List<Integer> randomArray1 = List.of(2, 4, 5, 7, 8, 9, 10, 13);
        Optional<Integer> max = randomArray1.stream().reduce(Integer::max);
        System.out.println("Max :" + max);

        Optional<Integer> min = randomArray1.stream().reduce(Integer::min);
        System.out.println("Min : " + min);

        Optional<Integer> average = randomArray1.stream().reduce(Integer::sum);

        //Limit
        System.out.println();
        System.out.println("Limit ");
        List<Integer> limitData = randomArray1.stream().filter(i -> i % 2 == 0).limit(3).collect(Collectors.toList());
        System.out.println("LimitData :" + limitData);

        //Filter Even Length Strings:
        System.out.println();
        List<String> nameData = List.of("Mona","tul","Pinky","yash");
        List<String> evenLenghtString = nameData.stream().filter(i->i.length()%2==0).collect(Collectors.toList());
        System.out.println("EvenLengthString: "+evenLenghtString);

    }


    private static boolean isPrime(Integer n) {
        return IntStream.rangeClosed(2, n / 2).noneMatch(i -> n % i == 0);
    }

}
