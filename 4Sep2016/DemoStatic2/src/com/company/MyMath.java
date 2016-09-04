package com.company;

/**
 * Created by zeeshanhanif-pc on 9/4/2016.
 */
public class MyMath {

    public static String name = "Hello";
    public int age = 56;

    public static int min(int a, int b){
        System.out.println(name);
        //System.out.println(age);
        if(a>b){
            return b;
        }
        else {
            return a;
        }
    }

    public static int max(int a, int b){
        if(a<b){
            return b;
        }
        else {
            return a;
        }
    }
}
