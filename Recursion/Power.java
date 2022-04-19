package com.pragya;

public class Power {

    public static void main(String[] args) {
        System.out.println(pow(4,2));
    }

    //Calculate Power of a number using Recursion

    public static int pow(int power,int base){
        if(power==0){
            return 1;
        }
        if(power==1){
            return base;
        }
        return base*pow(power-1,base);
    }
}
