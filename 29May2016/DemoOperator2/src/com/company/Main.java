package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int a = 5;//00000101
        int b = 6;//00000110
        int c = a & b;//00000100

        int a1 = 7;//00000111
        int b1 = 9;//00001001
        int c1 = a1 & b1;//00000001

        System.out.println("C = "+c);
        System.out.println("C1 = "+c1);
    }
}
