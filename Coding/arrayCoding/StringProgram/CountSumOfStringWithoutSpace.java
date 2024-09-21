package com.Coding.arrayCoding.StringProgram;

import java.util.Scanner;

public class CountSumOfStringWithoutSpace {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int count = 0;
        char splittedArray[] = s.toCharArray();
        for (int i = 0; i < splittedArray.length; i++) {
            if(splittedArray[i]!=' ')
            count++;
        }
        System.out.println("Count  : "+count);
    }

}
