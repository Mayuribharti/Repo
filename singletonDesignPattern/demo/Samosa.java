package com.singletonDesignPattern.demo;

public class Samosa {
    private static Samosa samosa;

    private Samosa() {

    }

    public static Samosa getSamosa() {
        if (samosa == null) {
            synchronized (Samosa.class) {
                samosa = new Samosa();
            }
        }
        return samosa;

    }

    public static void main(String[] args) {
        System.out.println(getSamosa().hashCode());
        System.out.println(getSamosa().hashCode());
    }

}