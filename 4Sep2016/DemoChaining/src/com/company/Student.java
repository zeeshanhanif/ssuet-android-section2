package com.company;

/**
 * Created by zeeshanhanif-pc on 9/4/2016.
 */
public class Student {
    private String name;
    private int age;
    private String email;

    public Student(){
        System.out.println("Empty");
    }

    public Student(String name){
        this();
        System.out.println("one argument");
        this.name = name;
    }

    public Student(String name, int age){
        this(name);
        System.out.println("two argument");
        this.age = age;
    }

    public Student(String name, String email, int age) {
        this(name,age);
        System.out.println("three argument");
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
