package src;

/* Problem Statement
Write a function that accepts a character array, a zero-based start position and a length.
It should return a character array containing *length characters starting with the *start character
of the input array. The function should do error checking on the start position and the length and
return null if the either value is not legal.
The function signature is:
char[ ] f(char[ ] a, int start, int len)
*/

import java.util.Arrays;

public class Sample3 {
    private static char[] solve(char[] arr, int start, int len){
        if(start < 0) start = arr.length -1;
        if(len < 0) return null;
        if(arr.length-1 < start || arr.length < start+len){
            return null;
        }
//        return Arrays.copyOfRange(arr, start, start+len);
        char[] newArr = new char[len];
        int idx = 0;
        for(int i = start; i < start+len; i++){
            newArr[idx] = arr[i];
            idx++;
        }
        return newArr;
    }


    public static void main(String[] args){
        System.out.println("starting...");

        test(new char[]{'a', 'b', 'c'}, 0, 4, null);
        test(new char[]{'a', 'b', 'c'}, 0, 3, new char[]{'a', 'b', 'c'});
        test(new char[]{'a', 'b', 'c'}, 0, 2, new char[]{'a', 'b'});
        test(new char[]{'a', 'b', 'c'}, 0, 1, new char[]{'a'});
        test(new char[]{'a', 'b', 'c'}, 1, 3, null);
        test(new char[]{'a', 'b', 'c'}, 1, 2, new char[]{'b', 'c'});
        test(new char[]{'a', 'b', 'c'}, 1, 1, new char[]{'b'});
        test(new char[]{'a', 'b', 'c'}, 2, 2, null);
        test(new char[]{'a', 'b', 'c'}, 2, 1, new char[]{'c'});
        test(new char[]{'a', 'b', 'c'}, 3, 1, null);
        test(new char[]{'a', 'b', 'c'}, 1, 0, new char[]{});
        test(new char[]{'a', 'b', 'c'}, 1, 0, new char[]{});
        test(new char[]{'a', 'b', 'c'}, -1, 2, null);
        test(new char[]{'a', 'b', 'c'}, -1, -2, null);
        test(new char[]{}, 0, 1, null);
    }

    private static void test(char[] arr, int start, int len, char[] res){
        System.out.printf("input: %s, %d, %d, : ", Arrays.toString(arr), start, len);
        char[] output = solve(arr, start, len);
        String outputF = Arrays.equals(output, res) ? "passed ✓" : "failed ✗";
        System.out.print(outputF);
        System.out.printf(" output: %s\n", Arrays.toString(output));
    }

}
