package com.OOPS.Methods;

public class MethodOverloading {

    static void sum(int a , int b){
        System.out.println(a+b);
    }

    static void sum(int a , int b, int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        sum(2,3);
        sum(2,1,3);
    }
}
