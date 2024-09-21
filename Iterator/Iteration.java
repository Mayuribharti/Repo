package com.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteration {
    public static void main(String[] args) {

        List<String> name= new ArrayList<>();
        name.add("Mayur");
        name.add("Mona");
        name.add("Bittu");
        name.add("sonam");

        //using foe each loop
        for(String i : name){
            System.out.println(i);
        }

        Iterator<String> iterator = name.iterator();
        if(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
