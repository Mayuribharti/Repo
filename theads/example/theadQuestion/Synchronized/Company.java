package com.theads.example.theadQuestion.Synchronized;

public class Company {
    int n;

    synchronized public void produce_item(int i) {
        this.n = n;
        System.out.println("Produced : " + this.n);
    }

    synchronized public int consume_item() {
        System.out.println("Consumed : " + this.n);
        return this.n;
    }
}
