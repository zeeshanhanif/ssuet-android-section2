package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int num01 = 25;

        Scanner omer = new Scanner(System.in);
        int a,j=0;
       //  a = omer.nextInt();
       // System.out.println(a);
        int b=1;
              while(b==1 && j<3){
                  System.out.println("Plz enter any no.");
                  a=omer.nextInt();
                  if(num01==a){
                      System.out.println("User's Entered Number is Equal");
                  }
                  else{
                      System.out.println("User's Entered Number is Not Equal");
                      System.out.println("press 1 if u continue");
                      System.out.println("Or  Any other key to break");
                       b=omer.nextInt();
                       j++;


                  }
              }






    }
}
