package com.OOPS;

public class StaticVariable {

    int id;
    String name;
    static   String schoolName = "K.V.S";

    public StaticVariable(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name + " " + schoolName);
    }

    public static void main(String[] args) {
        StaticVariable staticVariable = new StaticVariable(1, "Mayuri");
        staticVariable.display();

        StaticVariable staticVariable1 = new StaticVariable(2, "Neha");
        staticVariable1.display();
    }
}
