package com.Genrics;

import java.util.Iterator;

public class Demo<T> {

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Demo(T item){
        this.item= item;
    }

    public static void main(String[] args) {
        Demo demo = new Demo(5);

    }
}