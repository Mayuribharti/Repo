package com;

public final class ImmutableClass {

  private String name ;
  private int age;

  public ImmutableClass(String name, int age){
      this.name= name;
      this.age= age;
  }

  public String getName(){
      return name;
  }

  public int getAge(){
      return  age;
  }

    public static void main(String[] args) {
        ImmutableClass immutableClass = new ImmutableClass("Mona",61);

        String name = (immutableClass.getName());
        int age = immutableClass.getAge();


        /*

    In this code:

    An immutable class in Java is a class whose instances cannot be modified after they are created.
    Once an immutable object is created, its state (i.e., its data) cannot be changed. Immutable classes
     provide several benefits, including thread safety, simplification of concurrent programming, and
     enhanced security.

    The class ImmutableClass is declared final to prevent inheritance.
    It has two private final fields, age and name, which are initialized through the constructor.
    There are no setter methods, so once an instance of ImmutableClass is created, its state cannot be changed.
    The getAge() and getName() methods are provided to retrieve the values of the fields.
    In the main() method, an instance of ImmutableClass is created, and its data is retrieved and printed.
    This implementation ensures that instances of ImmutableClass are thread-safe and cannot be modified after
    creation, making it suitable for use in concurrent environments and promoting better code maintainability
     and reliability.

*/

    }

}
