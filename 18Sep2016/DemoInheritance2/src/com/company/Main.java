package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Human h = new Human();
        Human t = new Teacher();
        Human s = new Student();
        h.name = "Aziz";
        t.name = "Umair";
        s.name = "Muzammil";

        /*
        long abc = 5;
        int xyz = (int)abc;
        */

        Student ss = (Student) s;
        ss.rollNo = 1234;
        //Student ts = (Student) t;
        Teacher ts = (Teacher) t;
        ts.qualifications = "BBA, MBA";

        System.out.println(h.name);
        System.out.println(t.name);
        System.out.println(s.name);
        System.out.println(ss.rollNo);
        System.out.println(ts.qualifications);


    }
}
