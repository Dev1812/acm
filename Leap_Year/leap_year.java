import java.util.Scanner;
import java.io.PrintWriter;
public class Solution {
  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    PrintWriter writer = new PrintWriter(System.out);
    
    int year = scan.nextInt();
    int result = 28;
    
    if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))  {
      result = 29;
    }

    writer.print(result);
    writer.close();
  }
}