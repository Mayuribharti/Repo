package com.Java_Eight.MethodConstructor.optional_class;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {

        Optional<String> name=Optional.ofNullable(null);
        if(name.isPresent()){
            System.out.println(name.get());
        }

        System.out.println(name.orElse("contains null value"));
    }
}
