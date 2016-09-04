package com.company;

/**
 * Created by zeeshanhanif-pc on 9/4/2016.
 */
public class Student {
    private String name;
    private int age;

    public Student(String name,int age,String email){
        this.name = name;
        this.age = age;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void displayName(){
        System.out.println(this.getName());
    }

}
