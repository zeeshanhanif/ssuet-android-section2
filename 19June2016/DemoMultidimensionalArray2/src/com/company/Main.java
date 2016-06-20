package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int arr1[][] = new int[2][];
        arr1[0] = new int[3];
        arr1[1] = new int[5];

        arr1[0][0] = 0;
        arr1[0][1] = 1;
        arr1[0][2] = 2;

        arr1[1][0] = 10;
        arr1[1][1] = 15;
        arr1[1][2] = 20;
        arr1[1][3] = 25;
        arr1[1][4] = 30;


        for( int i =0; i < arr1.length; i++){

            for(int nested = 0; nested < arr1[i].length; nested++){
                System.out.println(arr1[i][nested]);
            }
        }


    }
}
