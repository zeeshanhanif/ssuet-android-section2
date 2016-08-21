package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a;
        a = 6;
        System.out.println(a);

        Student st = new Student();
        System.out.println(st.getAge());
        st.setAge(29);
        System.out.println(st.getAge());



    }
}
