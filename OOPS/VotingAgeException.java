package com.OOPS;

import java.util.Scanner;

public class VotingAgeException extends RuntimeException {
   VotingAgeException(String message) {
        super(message);
    }

}

class Voting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("person can vote");
        } else {
            throw new VotingAgeException("you are not eligible for vote");
        }


    }


}
