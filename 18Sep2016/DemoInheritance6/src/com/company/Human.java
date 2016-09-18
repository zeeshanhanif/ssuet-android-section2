package com.company;

/**
 * Created by zeeshanhanif-pc on 9/18/2016.
 */
public class Human{
    public String name;
    public int age;

    public Human(){
        System.out.println("Human empty");
    }


    public void study(){
        System.out.println("Human is sleeping.....");
    }

    public void displayName(){
        System.out.println("Name = "+this.name);
    }

}
