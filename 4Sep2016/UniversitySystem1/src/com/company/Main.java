package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student s = new Student("Aziz",45);
        University u = new University("SSUET");
        u.setStudent(s);

        Student ss = u.getStudent();

        System.out.println(s.getName());
        System.out.println(u.getName());
        System.out.println(ss.getName());
        ss.setName("Hello World");
        System.out.println(s.getName());

    }
}
