package com.ComparableAndComparetor.practice;


interface  Interface1{
    void show();
}

interface  Interface2{
    void show();
}

public class Demoo implements Interface1,Interface2 {
    @Override
    public void show() {
        System.out.println("hello");
    }


    public static void main(String[] args) {
        Demoo demoo = new Demoo();
        demoo.show();
    }

}
