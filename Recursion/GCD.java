package com.pragya;

public class GCD {


    public static void main(String[] args) {
        System.out.println(findGCD(48,32));

    }

    // Find GCD (Greatest Common Divisor) of two numbers using recursion

    public static int findGCD(int number1 , int number2){
        if(number1<0||number2<0){
            return -1;
        }
        if(number2==0){
            return number1;
        }

        return findGCD(number2,number1%number2);
    }
}
