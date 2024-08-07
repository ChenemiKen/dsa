import java.util.Scanner;

public class Anagram {
  static boolean isAnagram(String a, String b) {
    // Complete the function
    a = a.toLowerCase();
    b = b.toLowerCase();
    if(a.length() != b.length()) return false;
    for(int i=0; i<a.length(); i++){
      String letter = a.substring(i, i+1);
      int freqa = 0;
      int freqb = 0;
      for(int j=0; j<a.length(); j++){
        if(a.substring(j, j+1).equals(letter)) freqa++;
        if(b.substring(j, j+1).equals(letter)) freqb++;
      }
      if(freqa != freqb) return false;
    }
    return true;
  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();
    boolean ret = isAnagram(a, b);
    System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
  }
}
