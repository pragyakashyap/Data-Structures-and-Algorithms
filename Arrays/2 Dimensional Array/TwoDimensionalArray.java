package com.pragya;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        // Creating 2D array
        int[][] my2DArr = new int[2][2]; // 3 ROWS and 3 COLUMNS
        my2DArr[0][0] = 1;
        my2DArr[0][1]=2;
        my2DArr[1][0]=3;
        my2DArr[1][1]=4;

        // OR We can also create the array in single line
        int[][] arr = {{1,2},{3,4}};

        /* Operations on 2D Array
        ----------------------------------------------------------------
         */

        int [][]  array = create(5,5);
        insert(array,3,4,12);
        accessCells(array,3,4);
        search(array,12);
        traverse(array);
        delete(array,12);



    }

    // Create an Empty Array with value as minimum Integer value
    public static int[][] create(int row  , int col){
        int[][] array = new int[row][col];
        for(int i=0;i< array.length;i++){
            for(int j=0;j<array[0].length;j++){
                array[i][j]=Integer.MIN_VALUE;
            }
        }
        System.out.println(Arrays.deepToString(array));
        return array;
    }

    //insertion in 2D array
    public static void insert(int[][] array,int row , int col , int value){
        try {
            array[row][col]=value;
            System.out.println("Value inserted successfully");
        }catch(Exception e ){
            System.out.println(e);
        }
    }

    //Accessing cells from the 2D Array
    public static void accessCells(int[][] array , int row , int col){
        try{
            System.out.println("The value found is "+array[row][col]);
        }catch(Exception e){
            System.out.println("Invalid indices");
        }
    }

    // Searching for  a value inside 2D Array
    public static void search(int[][] array , int value){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(array[i][j] == value){
                    System.out.println("Value found at row "+i+" and column "+j);
                    return;
                }
            }
        }
        System.out.println("Value not found");
    }

    // Traversing a 2D array
    public static void traverse(int[][] array){
        for(int row=0;row<array.length;row++){
            for(int col=0;col<array[0].length;col++){
                System.out.print(array[row][col]+" ");
            }
        }
    }

    // Deleting a value from a 2D array
    // Either we can set the value as 0 or minimum integer value as this array is having integer datatype

    public static void delete(int[][]array,int value){
        for(int row=0;row<array.length;row++){
            for(int col=0;col<array[0].length;col++){
                if(array[row][col]==value){
                    array[row][col]= 0;
                    return;
                }
            }
        }
        System.out.println("Value not found in the array");
    }

}
