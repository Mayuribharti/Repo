package com.FailSafeFailFastDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {
    public static void main(String[] args) {
        List<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Orange");

        Iterator<String> list = fruit.iterator();
        while(list.hasNext()){
            System.out.println(list.next());
            fruit.remove("Banana");  // we are trying to remove an object while traversing list produce
            // ConcurrentModificationException
        }

    }
}
