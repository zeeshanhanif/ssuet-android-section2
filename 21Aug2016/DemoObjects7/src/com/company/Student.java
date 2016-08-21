package com.company;

/**
 * Created by zeeshanhanif-pc on 8/21/2016.
 */
public class Student {

    private String name;
    private int age;

    public Student(String n, int a){
        System.out.println("Hello Student");
        name = n;
        age = a;
    }

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }

    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }
}
