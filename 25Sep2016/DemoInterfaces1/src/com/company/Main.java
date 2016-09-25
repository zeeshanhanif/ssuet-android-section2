package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyFirst mf = new MyFirst();
        mf.doSomeWork();

        First f = new MyFirst();
        f.doSomeWork();

        First f1 = mf;
        f1.doSomeWork();




    }
}
