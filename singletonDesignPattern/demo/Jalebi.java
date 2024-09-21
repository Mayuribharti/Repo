package com.singletonDesignPattern.demo;

public class Jalebi {
    private static Jalebi jalebi = new Jalebi();

    private  static Jalebi getJalebi(){
        return jalebi;
    }
}
