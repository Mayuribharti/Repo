package com.OptionalClass;

import java.util.Optional;

public class Optionall {


    public static void main(String[] args) {

        Optional<String> optional1 = Optional.of("Hello");
        System.out.println(optional1.get()); // Output: Hello

        Optional<String> optional2 = Optional.empty();
        System.out.println(optional2.isPresent());//false

        String str = null;
        Optional<String> optional3 = Optional.ofNullable(str);
        System.out.println(optional3.isPresent()); // Output: false




    }
}
