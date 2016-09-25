package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<String, Integer> list = new HashMap<String,Integer>();
        list.put("First",45);
        list.put("Second",32);
        list.put("Third",23);
        list.put("Forth",54);
        list.put("Forth",2222);
        list.put("Fifth",45);

        System.out.println("Hashmap size "+list.size());

        System.out.println(list.get("Forth"));

        HashSet<String> list1 = new HashSet<String>();
        list1.add("Hello");
        list1.add("Hello");
        System.out.println("HashSet size "+list1.size());
    }
}
