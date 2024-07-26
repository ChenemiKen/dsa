package src;

import java.util.ArrayList;
import java.util.Arrays;

/* Problem Statement
Write a function to return an array containing all elements common to two given arrays containing distinct positive
integers. You should not use any inbuilt methods. You are allowed to use any number of arrays.
The signature of the function is: int[] f(int[] first, int[] second)
 */
public class Sample5 {
    private static int[] distinct(int[] first, int[] second){
        if(first == null || second == null) return null;

        ArrayList<Integer> commons = new ArrayList<>();
        for(int i: first){
            for(int j: second){
                if(i == j) commons.add(j);
            }
        }
        int[] commsArr = new int[commons.size()];
        int idx = 0;
        for(int e: commons){
            commsArr[idx] = e;
            idx++;
        }
        return commsArr;
    }

    public static void main(String[] args){
        System.out.println("Running...");

        test(new int[]{1, 8, 3, 2}, new int[]{4, 2, 6, 1}, new int[]{1, 2});
        test(new int[]{1, 8, 3, 2, 6}, new int[]{2, 6, 1}, new int[]{2, 6, 1});
        test(new int[]{1, 3, 7, 9}, new int[]{7, 1, 9, 3}, new int[]{1, 3, 7, 9});
        test(new int[]{1, 2}, new int[]{3, 4}, new int[]{});
        test(new int[]{}, new int[]{1, 2, 3}, new int[]{});
        test(new int[]{1, 2}, new int[]{}, new int[]{});
        test(new int[]{1, 2}, null, null);
        test(null, new int[]{}, null);
        test(null, null, null);

    }

    private static void test(int[] first, int[] second, int[] res){
        System.out.printf("input: %s, %s : ", Arrays.toString(first), Arrays.toString(second));
        int[] output = distinct(first, second);
        String outputF = Arrays.equals(output, res) ? "passed ✓" : "failed ✗";
        System.out.print(outputF);
        System.out.printf(" || output: %s%n", Arrays.toString(output));
    }
}
