package com.pragya;

public class Fibonacci {


    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);
        printFib(a,b,5);


    }

    public int fibonacci(int n){
        if(n<0){
            return -1;
        }
        if(n==0 || n==1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);

    }

    public static void printFib(int a , int b , int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.print(" "+c);
        printFib(b,c,n-1);
    }

}
