package com.OOPS.Encapsulation;

class Check {
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        Check check = new Check();
        check.setName("pinky");
        System.out.println(check.getName());
    }


}
