package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a1[] = new int[3];
        a1[0] = 15;
        a1[1] = 65;
        a1[2] = 165;

        for(int member:a1){
            System.out.println(member);
        }

        int a2[][] = new int[3][2];

        a2[0][0] = 1;
        a2[0][1] = 2;

        a2[1][0] = 5;
        a2[1][1] = 6;

        a2[2][0] = 10;
        a2[2][1] = 11;


        for(int[] m2:a2){

            for(int m3:m2){
                System.out.println(m3);
            }
            System.out.println("ended...");

        }


        System.out.println("    |         |    ");
        System.out.println("---------------------");
        System.out.println("    |         |     ");
        System.out.println("---------------------");
        System.out.println("    |         |      ");



    }
}
