import java.util.Scanner;
import java.io.PrintWriter;
public class Solution {
  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    PrintWriter writer = new PrintWriter(System.out);
    
    int mark = scan.nextInt();
    int result = 0;
    
    if(mark >= 0 && mark <= 28) {
      result = 2;
    } else if(mark >= 29 && mark <= 52) {
      result = 3;
    } else if(mark >= 53 && mark <= 77) {
      result = 4;
    } else if(mark >= 78 && mark <= 100) {
      result = 5;
    }
    
    writer.print(result);
    writer.close();
  }
}