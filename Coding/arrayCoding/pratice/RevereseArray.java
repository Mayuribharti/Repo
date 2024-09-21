package com.Coding.arrayCoding.pratice;

import java.util.List;

public class RevereseArray {
    public static void main(String[] args) {

        List<Integer> randomList = List.of(4,1,8,9,3,5);
        for(int i = randomList.size()-1 ; i>0 ; i--){
            System.out.println(randomList.get(i));
        }
    }
}
