import java.util.Scanner;
import java.io.PrintWriter;
public class Solution {
  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    PrintWriter writer = new PrintWriter(System.out);
    
    int phone_number = scan.nextInt();
    int result = 0;
    
    if(110000000 <= phone_number || phone_number >= 999999999) {
       result = phone_number / 100000 % 1000;   
    }
    writer.print(result);
    writer.close();
  }
}