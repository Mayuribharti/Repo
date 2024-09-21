package com.Coding.arrayCoding.streamapi;

import java.util.List;

public class SumOfArray {
    private static SumOfArray sumOfArray;
    private SumOfArray(){

    };

   private static SumOfArray getobject(){

       if(sumOfArray==null) {
           synchronized (SumOfArray.class) {
               sumOfArray = new SumOfArray();
           }
       }
       return sumOfArray;
   }

    public static void main(String[] args) {
/*

        List<Integer> randomList = List.of(4,1,2,3);

        int sum = randomList.stream().reduce(0,(a,b)->a+b);
        System.out.println("Sum : "+sum );
*/




    }
}
