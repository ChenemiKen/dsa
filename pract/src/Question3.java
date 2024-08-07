package src;

import java.util.Arrays;

/* Problem Statement
An array is defined to be a 235 array if the number of elements divisible by 2 plus the number of
elements divisible by 3 plus the number of elements divisible by 5 plus the number of elements not
divisible by 2, 3, or 5 is equal to the number of elements of the array. Write a method named
is123Array that returns 1 if its array argument is a 235 array, otherwise it returns 0.

If you are writing in Java or C#, the function signature is
int is235Array(int[ ] a)

If you are writing in C or C++, the function signature is
int is235Array(int a[ ], int len) where len is the length of a

Hint: remember that a number can be divisible by more than one number

Examples

In the following: <a, b, c, d> means that the array has a elements that are divisible by 2,
b elements that are divisible by 3, c elements that are divisible by 5 and d elements that are not
divisible by 2, 3, or 5.
*/
public class Question3 {
    private static int is235Array(int[] a){
        int divBy2 = 0;
        int divBy3 = 0;
        int divBy5 = 0;
        int divByNone = 0;

        for (int el : a) {
            if (el % 2 == 0) divBy2++;
            if (el % 3 == 0) divBy3++;
            if (el % 5 == 0) divBy5++;
            if (el % 2 != 0 && el % 3 != 0 && el % 5 != 0) divByNone++;
        }

        if(divBy2 + divBy3 +  divBy5 + divByNone == a.length) return 1;
        return 0;
    }

    public static void main(String[] args) {
        test(new int[]{2, 3, 5, 7, 11}, 1);
        test(new int[]{2, 3, 6, 7, 11}, 0);
        test(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10}, 0);
        test(new int[]{2, 4, 8, 16, 32}, 1);
        test(new int[]{3, 9, 27, 7, 1, 1, 1, 1, 1}, 1);
        test(new int[]{7, 11, 77, 49}, 1);
        test(new int[]{2}, 1);
        test(new int[]{}, 1);
        test(new int[]{7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7}, 1);
    }

    private static void test(int[] arr, int res){
        System.out.printf("input: %s, : ", Arrays.toString(arr));
        int output = is235Array(arr);
        String outputF = output == res ? "passed ✓" : "failed ✗";
        System.out.print(outputF);
        System.out.printf(" output: %d\n", output);
    }
}
