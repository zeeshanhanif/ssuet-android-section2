package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = new String("Hello World");
        String s3 = new String("Hello World");
        String s4 = s3;
        String s1 = "Hello World";
        String s2 = "Hello World";
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println(5);
        System.out.println(s==s3);
        System.out.println(s==s1);
        System.out.println(s1==s2);
        System.out.println(s3==s4);

        System.out.println(s.equals(s3));
        System.out.println(s.equals(s1));


    }
}
