package src;

import java.util.Arrays;

/* Problem Statement
Consider an array A with n of positive integers. An integer idx is called a POE (point of equilibrium) of A,
if A[0] + A[1] + … + A[idx – 1] is equal to A[idx + 1] + A[idx + 2] + … + A[n – 1].
Write a function to return POE of an array, if it exists and -1 otherwise.
The signature of the function is: int f(int[] a)
*/
public class Sample6 {
    private static int findPoe(int[] arr){
        for(int i=0; i<arr.length; i++){
            int left = 0;
            for(int j=0; j<i; j++){
                left += arr[j];
            }
            int right = 0;
            for(int j=i+1; j<arr.length; j++){
                right += arr[j];
            }
            if(left == right) return i;
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.println("Running...");

        test(new int[]{1, 8, 3, 7, 10, 2}, 3);
        test(new int[]{1, 5, 3, 1, 1, 1, 1, 1, 1}, 2);
        test(new int[]{2, 1, 1, 1, 2, 1, 7}, 5);
        test(new int[]{1, 2, 3}, -1);
        test(new int[]{3, 4, 5, 10}, -1);
        test(new int[]{1, 2, 10, 3, 4}, -1);
    }

    private static void test(int[] arr, int res){
        System.out.printf("input: %s : ", Arrays.toString(arr));
        int output = findPoe(arr);
        String outputF = output == res ? "passed ✓" : "failed ✗";
        System.out.print(outputF);
        System.out.printf(" || output: %s%n", output);
    }
}
