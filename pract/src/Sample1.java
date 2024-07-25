package src;

/* Problem Statement
An array with an odd number of elements is said to be centered if all elements (except the middle one)
are strictly greater than the value of the middle element. Note that only arrays with an odd number
of elements have a middle element. Write a function that accepts an integer array and returns 1 if
it is a centered array, otherwise it returns 0. */

import java.util.Arrays;

public class Sample1 {
    static int centeredArray(int[] arr){
        if(arr.length % 2 == 0) return 0;

        int mid = arr.length/2;
        int midVal = arr[mid];
        for(int i = 0; i<arr.length; i++){
            if(i != mid){
                if(arr[i] <= midVal) return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        assert centeredArray(arr1) == 0;
        int[] arr2 = {3, 2, 1, 4, 5};
        assert centeredArray(arr2) == 1;
        int[] arr3 = {3, 2, 1, 4, 1};
        assert centeredArray(arr3) == 0;
        int[] arr4 = {1, 2, 3, 4};
        assert centeredArray(arr4) == 0;
        int[] arr5 = {};
        assert centeredArray(arr5) == 0;
        int[] arr6 = {10};
        assert centeredArray(arr6) == 1;
        System.out.println("Passed");
    }
}
