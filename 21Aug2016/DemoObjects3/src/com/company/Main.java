package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student st = new Student();
        System.out.println(st.name);
        System.out.println(st.age);
        //System.out.println();;
        st.study();
        //System.out.println(st.payFee());
        int abc = st.payFee();
        System.out.println(abc);
    }
}
