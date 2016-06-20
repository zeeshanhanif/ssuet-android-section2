package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int arr1[] = new int[]{0 , 2, 4 , 6 , 8};
        int arr2[] = new int[]{1, 3 , 5, 7 , 9};

        int arr4[] = new int[5];
        arr4[0] = 58;


        int arr3[][] = new int[2][3];
        arr3[0][0] = 1;
        arr3[0][1] = 3;
        arr3[0][2] = 5;
        arr3[1][0] = 11;
        arr3[1][1] = 22;
        arr3[1][2] = 33;



        for (int ii =0; ii < arr3.length; ii++){

            for(int ij =0; ij < arr3[ii].length; ij++){
                System.out.println(arr3[ii][ij]);
            }
            System.out.println("-**************-");
        }

        /*
        *  {
        *       { * , *, *},
        *       { *, * , *}
        *  }
        * */


    }



}
