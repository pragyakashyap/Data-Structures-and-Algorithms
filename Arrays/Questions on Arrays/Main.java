package com.pragya;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Questions question = new Questions();
        question.question1();
        int[] arr={2,6,3,9,11};
        question.question2(arr,12);
        question.question3(arr,9);
        int[] arr1={2,1,3,5,4,6};
        int[] arr2={1,3,2,4,6,5};
        question.question4(arr1,arr2);
        question.question5(arr);
        System.out.println(question.question6(arr));
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(question.question7(matrix)));
    }

}
