package com.OOPS.Construtor.paramatrizedConstructor;

public class ParameterCons {
    String name;
    int age;

    ParameterCons(String name , int age){
        this.name = name;
        this.age=age;
    }

    public static void main(String[] args) {
        ParameterCons parameterCons = new ParameterCons("Mona",23);
        System.out.println(parameterCons.name);
        System.out.println(parameterCons.age);
    }

}
