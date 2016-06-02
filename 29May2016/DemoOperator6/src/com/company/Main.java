package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 5;
        int b = 6;
        boolean c1 = true || false; // always true
        boolean c2 = false || true; // always true
        boolean c3 = false || false; // always false
        boolean c4 = true || true; // always true
        boolean c5 = a > 5 || b < 7;
        boolean c6 = a >= 5 || ++b < 9;

        System.out.println("C5 = " + c5);
        System.out.println("B = " + b);
        System.out.println("C6 = " + c6);
    }
}
