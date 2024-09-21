package com.Coding.arrayCoding.streamapi;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Stream4 {
    // Given a list of integers, sort all the
    // values present in it in descending order using Stream functions?

  /*  public static void main(String[] args) {
       List<Integer> list1 = List.of(3,1,3,5,9);

       list1.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
*/
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
     // scanner.close();
      for (int i = 1; i <= 10; i++) {
          System.out.println(n + " X " + i + " = " + n * i);
      }
  }
    }

