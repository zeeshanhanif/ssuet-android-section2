package com.company;

/**
 * Created by zeeshanhanif-pc on 9/4/2016.
 */
public class MyMath {

    public static String name = "Hello";
    public int age = 56;

    public static int min(int a, int b){
        System.out.println("Int");
        return a<b ? a : b;
    }

    /*public static int min(int a, int b,int c){
        System.out.println("Int");
        return a<b ? a : b;
    }*/

    public static double min(double a, double b){
        System.out.println("Double");
        return a<b ? a : b;
    }

    public static long min(long a, long b){
        System.out.println("Long");
        return a<b ? a : b;
    }

    public static int max(int a, int b){
        return a>b ? a : b;
    }
}
