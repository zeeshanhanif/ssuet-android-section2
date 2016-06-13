package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Random r = new Random();
        int arr01[] = new int[5];

        for(int i = 0 ; i < arr01.length; i++){
            arr01[i]= r.nextInt(10);
        }

        for(int i = 0 ; i < arr01.length; i++){
            System.out.println(arr01[i]);
        }
    }
}
