package com.FailSafeFailFastDemo;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {
    public static void main(String[] args) {

        List<String> fruit =new CopyOnWriteArrayList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Orange");

        for (String item : fruit) {
            System.out.println(item);
            if (item.equalsIgnoreCase("Orange")) {
                fruit.remove(item);  // Remove element from the list
            }
        }
    }
}
