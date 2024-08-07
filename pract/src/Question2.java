package src;

import java.util.Arrays;

/* Problem Statement
Define an array to be a Mercurial array if a 3 does not occur between any two 1s.
Write a function named isMercurial that returns 1 if its array argument is a Mercurial array,
otherwise it returns 0.

If you are programming in Java or C#, the function signature is
int isMercurial(int[ ] a)
*/
public class Question2 {

     static int isMercurial(int[] a){
        boolean foundPreceding1 = false;
        boolean found3 = false;
        boolean foundAnother1 = false;


        for(int i : a){
            if(!foundPreceding1 && i == 1) foundPreceding1 = true;
            if(foundPreceding1 && i == 3) found3 = true;
            if(foundPreceding1 && found3 && i == 1) foundAnother1 = true;
        }

        if(foundPreceding1 && foundAnother1) return 0;
        return 1;
    }

    public static void main(String[] args) {
        test(new int[]{1, 2, 10, 3, 15, 1, 2, 2}, 0);
        test(new int[]{5, 2, 10, 3, 15, 1, 2, 2}, 1);
        test(new int[]{1, 2, 10, 3, 15, 16, 2, 2}, 1);
        test(new int[]{3, 2, 18, 1, 0, 3, -11, 1, 3}, 0);
        test(new int[]{2, 3, 1, 1, 18}, 1);
        test(new int[]{8, 2, 1, 1, 18, 3, 5}, 1);
        test(new int[]{3, 3, 3, 3, 3, 3}, 1);
        test(new int[]{1}, 1);
        test(new int[]{}, 1);
    }

    private static void test(int[] arr, int res){
        System.out.printf("input: %s, : ", Arrays.toString(arr));
        int output = isMercurial(arr);
        String outputF = output == res ? "passed ✓" : "failed ✗";
        System.out.print(outputF);
        System.out.printf(" output: %d\n", output);
    }
}
