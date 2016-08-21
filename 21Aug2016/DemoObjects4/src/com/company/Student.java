package com.company;

/**
 * Created by zeeshanhanif-pc on 8/21/2016.
 */
public class Student {
    private String name = "Ghazi";
    private int age = 35;

    public void setName(String n){
        //System.out.println(n);
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setAge(int a){
        if(a > 100 ){
            System.out.println("Incorrect age, please provide correct age");
        }
        else {
            age = a;
        }
    }

    public int getAge(){
        return age;
    }


}
