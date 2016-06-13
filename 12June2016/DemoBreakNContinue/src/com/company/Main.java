package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here



        /*System.out.println("Before loop");
        for(int i = 0; i < 100; i++){
            System.out.println(i + " Hello");

            if(i == 3){
                break;
            }
            System.out.println("After If");
        }

        System.out.println("Out of loop now");*/


        System.out.println("Before loop");
        for(int i = 0; i < 10; i++){
            System.out.println(i + " Hello");
            if(i%2 == 0){
                continue;

                //statement 01
                //statement 02
                //statement 03
            }
            System.out.println("+++++++++++++++++++");
        }

        System.out.println("Out of loop now");




    }
}
