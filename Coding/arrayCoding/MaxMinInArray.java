package com.Coding.arrayCoding;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxMinInArray {
    public static void main(String[] args) {

        int array[]= {4,1,6,9,2};

        int min , max;
        min=max=array[0];

        for(int i =0 ; i< array.length ; i++){
            if(array[i]>max){
                max = array[i];
            }

            if(array[i]<min){
                min = array[i];
            }
        }

        System.out.println("Min : "+min+"\n"+"max : "+max);




       /* //Using stream api
        OptionalInt i  = Arrays.stream(arr).max();
        OptionalInt i2 = Arrays.stream(arr).min();

        System.out.println("Max : "+i.getAsInt()+" \nmin :"+i2.getAsInt());*/

    }
}
