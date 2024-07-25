package src;

/* Problem Statement
Write a function that takes an array of integers as an argument and returns a value based on the
sums of the even and odd numbers in the array. Let X = the sum of the odd numbers in the array and
let Y = the sum of the even numbers. The function should return X – Y  */

public class Sample2 {
    private static int solve(int[] arr){
        int evenSum = 0;
        int oddSum = 0;
        for (int el: arr) {
            if(el % 2 == 0){evenSum += el;}
            else{oddSum += el;}
        }
        return oddSum - evenSum;
    }

    public static void main(String[] args){
        System.out.println("Starting...");

        int[][] inputs = {
                {1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4}, {3, 3, 4, 4},
                {3, 2, 3, 4}, {4, 1, 2, 3}, {1, 1}, {}
        };

        for(int[] arr : inputs){
            System.out.println(solve(arr));
        }
    }
}
