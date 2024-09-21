package com.OOPS.Exception;

import java.util.Scanner;
//for checked Exception ypu must have to extend Exception class
//for unchecked exception use RuntimeException
//in unchecked exception it can compile without try catch but will terminate so use try catch or throws
public class UnderAgeException extends Exception{

    //default Exception
    UnderAgeException(){
        super("Age must be 18+....");
    }

    //Parameterized Exception
    UnderAgeException(String msg){
        super(msg);
    }

    //must use try catch or throws other wise it will not complie
    public static void main(String[] args) throws UnderAgeException {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if(age<18){
            throw new UnderAgeException("you are not 18+");
        }
        else{
            System.out.println("You can vote....");
        }


    }
}
