package com.OOPS.inheritance.multipleInheritance;

interface cat {
    public void sound();
}

interface dog{
    public void sound();
}

public class MultipleInhertance implements cat,dog {
    @Override
    public void sound() {
        System.out.println("heheh");
    }

    public static void main(String[] args) {
        MultipleInhertance multipleInhertance = new MultipleInhertance();
        multipleInhertance.sound();
    }
}



