package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Human h = new Human();
        Teacher t = new Teacher();
        Student s = new Student();
        h.name = "Aziz";
        t.name = "Umair";
        s.name = "Muzammil";

        System.out.println(h.name);
        System.out.println(t.name);
        System.out.println(s.name);
        System.out.println("---");
        /*h.study();
        t.study();
        s.study();*/
        h.displayName();
        t.displayName();
        s.displayName();


    }
}
