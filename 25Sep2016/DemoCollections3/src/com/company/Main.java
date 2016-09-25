package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        System.out.println(list.size());

        list.add("Hello World");
        list.add("Hello World");
        list.add("asdfasd World");
        list.add("Hello asdfasdw3q");
        list.add("s234rsadf");

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
