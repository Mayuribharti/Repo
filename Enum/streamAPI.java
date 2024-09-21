package com.Enum;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamAPI {
    public static void main(String[] args) {
        //filter Operation
        List<Integer> list = List.of(4, 2, 5, 7, 3, 1, 2, 8, 6, 9);
        Stream<Integer> newList = list.stream();
        List<Integer> showEven = newList.sequential().parallel().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("ShowEven : " + showEven);

        //Map Operation
        List<Integer> list1 = List.of(4, 2, 6,3,1);
        List<Integer> mapResult = list.stream().map(n -> n * 1).collect(Collectors.toList());
        System.out.println("MapResult : " + mapResult);

        //sorted Operation
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted List : "+sortedList);

        //forEach
        List<Integer> numbers
                = Arrays.asList(2, 3, 4, 5, 2);
        numbers.stream().map(x->x-1).forEach(x -> System.out.println(Thread.currentThread()+" : "+x));

        //Write a Java program to implement a lambda expression to convert a list
        // of strings to uppercase and lowercase

        List<String> names = List.of("Neha","mayuri","uma","pinky");
        List<String> uppercaseString =names.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
        System.out.println(uppercaseString);

        System.out.println("Checking!......");
        //1.Even from a list
        List<Integer> randomArray = List.of(3,2,5,7,10,12,79,23,22,66);
        List<Integer> even = randomArray.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("Even Data : "+even);

        //Given a list of strings, filter out the strings that have a length less than 5
        // and convert the remaining strings to uppercase using the Stream API.
        List<String> name= List.of("Uma","Neha","Pinky","Rinku","Monu","Monalisa","tul-tul");
        List<String> nameData= name.stream().filter(i->i.length()>3)
                .map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("nameData : "+nameData);

        //max
        List<Integer> List3 = List.of(12,3,1,3,8,44);
        Optional<Integer> max=List3.stream().reduce(Integer::max);
        System.out.println("Max : "+max);


        List<Integer> integerList = List.of(4,4,1,3,7,5,2,6,8,10);
        Stream<Integer> streamList = integerList.stream();
        //Even List
        List<Integer> evenList = streamList.filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenList);


        //List of String to uppercase
        List<String> stringList = List.of("Mayuri","Neha","Uma","Puja");
        List<String> upperCase = stringList.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCase);





    }
}
