package com.Coding.arrayCoding;

public class demo {

    public void hello() {
        System.out.println("hehehe");
    }

}

class check extends demo {

    public void hello(){
        System.out.println("Hahahha");
    }
    public static void main(String[] args) {

        demo demo = new check();
        demo.hello();
    }

}