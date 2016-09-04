package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student s = new Student("Aziz",3);
        System.out.println(s.getName());
        System.out.println(s.getEmail());

        Student s1 = new Student("Umair","umair@gmail.com",12);
        System.out.println(s1.getName());
        System.out.println(s1.getEmail());

        Student s2 = new Student();


    }
}
