package com.company;

/**
 * Created by zeeshanhanif-pc on 9/18/2016.
 */
public class Human{
    public String name;
    public int age;

    public Human(String name, int age){
        //super();// by default
        this.name = name;
        this.age = age;
        System.out.println("Human two argument");
    }


    public void study(){
        System.out.println("Human is sleeping.....");
    }

    public void displayName(){
        System.out.println("Name = "+this.name);
    }

}
