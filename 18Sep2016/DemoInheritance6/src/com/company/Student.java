package com.company;

/**
 * Created by zeeshanhanif-pc on 9/18/2016.
 */
public class Student extends Human{

    public Student(String abc){
        //super(); // by default
        System.out.println("One Argument == "+abc);
    }


    public int rollNo;

    public void study(){
        System.out.println("Student is sleeping.....");
    }
}
