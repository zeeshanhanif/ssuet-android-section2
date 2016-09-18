package com.company;

/**
 * Created by zeeshanhanif-pc on 9/18/2016.
 */
public class Student extends Human{

    public Student(){
        super("abc",34);
        System.out.println("Student empty");
    }
    public int rollNo;

    public void study(){
        System.out.println("Student is sleeping.....");
    }
}
