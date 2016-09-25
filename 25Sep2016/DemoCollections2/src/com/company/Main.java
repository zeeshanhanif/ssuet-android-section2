package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList list = new ArrayList();

        System.out.println(list.size());

        list.add("Hello World");
        list.add("Hello World");
        list.add(45);
        list.add(12.45);
        list.add(true);
        list.add(false);
        System.out.println(list.size());
        System.out.println(list.get(2));

        System.out.println(list.contains(45));
        System.out.println(list.indexOf("Hello World"));


        System.out.println("---");
        for(Object o: list){
            System.out.println(o);
        }




    }
}
