package src;

import java.util.Arrays;

/* Problem Statement
A 123 array is an array that contains multiple repetitions of the values 1, 2, 3 in that order.
For example {1, 2, 3, 1, 2, 3, 1, 2, 3} is a 123 array but {1, 2, 3, 1, 2} is not.
Write a function named is123Array which returns 1 if its array argument is a 123 array,
otherwise it returns 0.

If you are programming in Java or C#, the function prototype is int is123Array(int[ ] a)
*/
public class Question1 {
    private static int is123Array(int[] a){
        if(a.length < 3) return 0;
        int i = 0;
        int j = 1;
        while(i < a.length){
            if(a[i] != j) return 0;
            i++;
            if(j == 3){
                j=1;
            }else{
                j++;
            };
        }
        return 1;
    }

    public static void main(String[] args) {
        test(new int[]{1, 2, 3, 3, 2, 1}, 0);
        test(new int[]{0, 1, 2, 3, 1, 2, 3}, 0);
        test(new int[]{1, 2, 3, 3, 2, 1, 1, 2, 3}, 0);
        test(new int[]{1, 2, 3}, 1);
        test(new int[]{}, 0);
    }

    private static void test(int[] arr, int res){
        System.out.printf("input: %s, : ", Arrays.toString(arr));
        int output = is123Array(arr);
        String outputF = output == res ? "passed ✓" : "failed ✗";
        System.out.print(outputF);
        System.out.printf(" output: %d\n", output);
    }
}
