package com.pragya;

import java.util.Arrays;

public class OperationOnArrays {


    static int[] myArr;

    public static void main(String[] args) {

        // creating a 1D Array
        myArr = new int[5];  // 1D Array of 5
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = Integer.MIN_VALUE; // Set the cells of the array as minimum value of the integer
        }
        System.out.println(Arrays.toString(myArr));

        //insertion
        insert(1, 23);
        insert(0, 22);
        insert(2, 24);
        insert(3, 25);
        insert(4, 26);

        System.out.println(Arrays.toString(myArr));

        //Accessing elements from an array
        System.out.println(myArr[0]); // Get 0th Element of the array

        //Searching For a value in an array
        searchValue(myArr, 89);

        //Traversing through myArr
        traverse(myArr);

        //delete 26 from the myArr
        delete(myArr, 26);


    }

    //insert Elements in am Array
    public static void insert(int location, int valueToBeInserted) {
        try {
            if (myArr[location] == Integer.MIN_VALUE) {
                myArr[location] = valueToBeInserted;
            } else {
                System.out.println("The Cells are occupied.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index");
        }
    }


    //Traversing a Given Array
    public static void traverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    // Searching Elements from an array
    public static void searchValue(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("Value found at index " + i);
                return;
            }
        }
        System.out.println("Value not found in the array");

    }

    //Deleting a Given value in an array
    public static void delete(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                arr[i] = Integer.MIN_VALUE;
                return;
            }
        }
        System.out.println("Valur is not there in the array");
    }


}


