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

        s.rollNo = 1234;
        t.qualifications = "BBA, MBA";

        System.out.println(h.name);
        System.out.println(t.name);
        System.out.println(s.name);
        System.out.println(s.rollNo);
        System.out.println(t.qualifications);


    }
}
