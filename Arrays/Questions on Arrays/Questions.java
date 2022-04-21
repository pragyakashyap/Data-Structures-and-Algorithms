package com.pragya;

public class Questions {
    /*
        Question 1 : Find the missing Number in an
        integer array of 1 to 100
         */
    public void question1() {
        int intArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
        int sum = 0;
        int sum1 = 100 * (100 + 1) / 2;
        for (int j : intArray) {
            sum += j;
        }
        int difference = sum1 - sum;
        System.out.println("The missing number is " + difference);
    }

    /*
    Question 2 --> Write a program to find all pairs of integers whose
    sum is equal to a given number
     */
    public void question2(int[] array, int sumValue) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] + array[i + 1] == sumValue) {
                System.out.println(array[i] + "," + array[i + 1]);
                return;
            }
        }
        System.out.println("Value Not Found");
    }

    /*
    Question 3 --> Write a program to check if an array contains a number
     */

    public void question3(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("Value found at index " + i);
                return;
            }
        }
        System.out.println("Value not found in the array");
    }

    /*
    Question 4 : Given two integer arrays . Write a program to
    check if they are permutation to each other
     */
    public boolean question4(int[] arr1, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;
        int product1 = 1;
        int product2 = 1;
        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
            product1 += arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            sum2 += arr2[j];
            product2 *= arr2[j];
        }
        if (sum1 == sum2 && product1 == product2) {
            return true;
        }
        return false;
    }

    /*
    Question 5 : Write a program to find maximum products of the elements inside array
     */

    public void question5(int[] arr) {
        int maxProduct = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (maxProduct < arr[i] * arr[j]) {
                    maxProduct = arr[i] * arr[j];
                }
            }
        }
        System.out.println("The maximum product is : " + maxProduct);
    }

    /*
    Question 6: Write a program to check if the array is having unique elements
     */
    public boolean question6(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    /*
    Question 7 : Rotate an array by 90 degrees
Step 1: Find transpose
Step 2: Flip Horizontally
     */
    public int[][] question7(int[][] matrix) {
        // Step 1 : Transpose of a matrix
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //Step 2 : Flip Horizontally
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length/2;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=temp;
            }
        }
        return matrix;
    }

}
