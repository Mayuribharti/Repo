package com.Coding.arrayCoding.codingQuestion.Practice;

public class Demo<T> {
    public T item;


    public T getItem(){
        return item;
    }

    public void setItem(T item){
        this.item = item;
    }

    public Demo(T item){
        this.item = item;
    }

    public static void main(String[] args) {
        Demo demo = new Demo("e");
        demo.getItem();
        System.out.println(demo.getItem());
    }
}
