package com.pragya;

public class SumDigit {


    public static void main(String[] args) {
        System.out.println(sumOfDigit(325));

    }

    // Find Sum Of Digits of a number using Recursion

    public static int sumOfDigit(int number){
        if(number==0){
            return 0;
        }
        return number%10+sumOfDigit(number/10);
    }
}
