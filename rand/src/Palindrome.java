import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    /* Enter your code here. Print output to STDOUT. */

    System.out.println(isPalindrome(A));
  }

  static String isPalindrome(String A){
    for(int i=0; i<A.length(); i++){
      int j = A.length()-1-i;
      if(A.charAt(i) != A.charAt(j))
        return "No";
    }
    return "Yes";
  }
}
