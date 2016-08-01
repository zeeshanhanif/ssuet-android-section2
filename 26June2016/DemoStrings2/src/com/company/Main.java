package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "Hello World";
        int index = s.indexOf("W");
        int index1 = s.indexOf("w");
        int index2 = s.indexOf("o",6);
        int lastIndex1 = s.lastIndexOf("o");
        System.out.println(index);
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(lastIndex1);
    }
}
