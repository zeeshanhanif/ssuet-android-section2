package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student s = new Student("Aziz",4);
        Student s1 = new Student("Umair",4);
        Student s2 = new Student("Umair2",23);
        Student s3 = new Student("Umair3",23);
        University u = new University("SSUET");
        u.addStudent(s);
        u.addStudent(s1);
//        u.addStudent(s2);
//        u.addStudent(s3);

        Student ss = u.getStudent(-1);
        System.out.println(ss);
        //u.getStudent("Umair2")
        //System.out.println(ss.getName());

    }
}
