package com.Coding.arrayCoding.codingQuestion;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println("Enter an integer :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int prime =0 ;

        for(int i = 1 ; i<=n%2 ; i++ ){
            if(n%i==0){
                prime= 1;
                break;
            }
        }

        if(prime==1){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }






    /*    //prime using stream api
        boolean isprime = IntStream.range(2, n).noneMatch(i -> n % i == 0);
        if (isprime) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not a prime");
        }


        //prime Number from a List
        List<Integer> randomArray = List.of(3, 2, 5, 7, 8, 9);
        List<Integer> integerList = randomArray.stream().filter(PrimeNumber::checkIfPrime).collect(Collectors.toList());
        System.out.println("prime Number : " + integerList);

    }

    private static boolean checkIfPrime(Integer number) {
        return IntStream.range(2, number / 2).noneMatch(i -> number % 2 == 0);
    }

*/
    }
}