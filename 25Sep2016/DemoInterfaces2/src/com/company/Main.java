package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyFirst mf = new MyFirst();
        mf.doSomeWork();
        mf.doMoreWork();
        First f = new MyFirst();
        f.doSomeWork();

        First f1 = mf;
        f1.doSomeWork();
        System.out.println("---");
        Second s = new MyFirst();
        s.doMoreWork();




    }
}
