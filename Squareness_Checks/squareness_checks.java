import java.util.Scanner;
import java.io.PrintWriter;
public class Solution {
  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    PrintWriter writer = new PrintWriter(System.out);
    
    String str = scan.nextLine();
    String result = "NO";
    int str_length = str.length();

    if(str_length % 2 == 0) {
      int str_half = str_length / 2;
      
      String str1 = str.substring(0, str_half);
      String str2 = str.substring(str_half);
      
      if(str1.equals(str2)) {
        result = "YES";
      }
    }
    
    writer.print(result);
    writer.close();
  }
}