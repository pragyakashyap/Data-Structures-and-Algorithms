package com.pragya;

public class Main {

    public static void main(String[] args) {
        //Factorial
        System.out.println(fact(4));





    }
    // Factorial using Recursion

    public static int fact(int n){
        if(n<1){
            return -1;
        }
        if(n==1 || n==0){
            return 1;
        }
        return n*fact(n-1);
    }


}
