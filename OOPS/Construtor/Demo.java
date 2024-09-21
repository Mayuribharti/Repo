package com.OOPS.Construtor;

public class Demo {

  int age ;
  String name;

  public Demo(String name , int age){
      this.name= name;
      this.age= age;
  }

    public static void main(String[] args) {
        Demo demo = new Demo("mona",78);
        System.out.println(demo.name+" , "+demo.age);
    }
}
