package com.Coding.arrayCoding;

import java.util.Scanner;

public class CopyOneArrayToAnother {
   public static void main(String[] args) {
      int []array1 = new int[5];
      int []array2 = new int[5];

      Scanner obj = new Scanner(System.in);
      for(int i =0;i<array1.length ;i++){
         array1[i]= obj.nextInt();
      }

      for(int i=0 ; i<array1.length;i++){
         array2[i] =array1[i];
      }

      System.out.println("Second Array ::");
      for(int i =0 ; i<array2.length ; i++){
         System.out.println(array2[i]);
      }

   }

}
