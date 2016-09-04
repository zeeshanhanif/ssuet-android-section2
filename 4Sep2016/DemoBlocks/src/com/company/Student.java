package com.company;

/**
 * Created by zeeshanhanif-pc on 9/4/2016.
 */
public class Student {

    private String name;
    private int age;

    public static String course;

    static {
        System.out.println("Static Block");
        course = "Android";
    }

    {
        System.out.println("Instance Block");
    }

    public Student(String name,int age ) {
        System.out.println("Two Argument");
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
