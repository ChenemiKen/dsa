package src;
/* Problem Statement
Write a function to reverse an integer using numeric operators and without using any arrays or other data structures.
The signature of the function is: int f(int n)
 */

public class Sample4 {
    private static int reverse(int n){
        boolean neg = false;
        if(n < 0){
            neg = true;
            n = Math.abs(n);
        }
        String[] nStr = String.valueOf(n).split("");
        String revNStr = "";
        for(int i=nStr.length-1; i>=0; i--){
            revNStr += nStr[i];
        }
        if(neg) revNStr = "-"+revNStr;
        return Integer.valueOf(revNStr);
    }
    public static void main(String[] args){
        System.out.println("Running...");

        test(1234, 4321);
        test(12005, 50021);
        test(1, 1);
        test(1000, 1);
        test(0, 0);
        test(-12345, -54321);
    }

    private static void test(int inp, int res){
        System.out.printf("input: %d, : ", inp);
        int output = reverse(inp);
        String outputF = output == res ? "passed ✓" : "failed ✗";
        System.out.print(outputF);
        System.out.printf(" || output: %s%n", output);
    }


}