package com.OOPS.Construtor;

public class CopyConstructor {

    int age ;
    String name;

    public  CopyConstructor(int age , String name ){
            this.name= name;
            this.age= age;
    }

    public CopyConstructor(CopyConstructor c){
        name = c.name;
        age = c.age;
    }

    public static void main(String[] args) {
        CopyConstructor copyConstructor = new CopyConstructor(13,"pinky");
        CopyConstructor copyConstructor1 = new CopyConstructor(copyConstructor);

        System.out.println(copyConstructor1.name+" , "+copyConstructor1.age);
    }
}
