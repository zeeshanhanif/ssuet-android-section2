package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        int input1 = 60;
        int input2 = 10;
        char operator = '_'; // +, - , *, /
        int isValidOperator = 1;
        int result = 0;

        /*if( operator == "+"){
            result = input1 + input2;
        }
        else if( operator == "-"){
            result = input1 - input2;
        }
        else if( operator == "*"){
            result = input1 * input2;
        }
        else if( operator == "/"){
            result = input1 / input2;
        }*/


        switch (operator){

            case '+':{
                result = input1 + input2;
                break;
            }
            case '-':{
                result = input1 - input2;
                break;
            }
            case '*':{
                result = input1 * input2;
                break;
            }
            case '/':{
                result = input1 / input2;
                break;
            }
            default:{
                System.out.println("Invalid operator");
                isValidOperator = 0;
            }



        }

        if(isValidOperator == 1){
            System.out.println("the result is " + result);
        }






    }
}
