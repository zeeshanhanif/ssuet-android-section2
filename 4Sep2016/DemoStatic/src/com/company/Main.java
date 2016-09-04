package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Student.course;
        System.out.println(Student.course);
        Student s = new Student("Aziz",45);
        Student s1 = new Student("Umair",10);
        s.course = "Java";
        System.out.println(s.course);
        System.out.println(s1.course);

        System.out.println(MyMath.min(10,6));
        System.out.println(MyMath.max(10,6));



    }
}
