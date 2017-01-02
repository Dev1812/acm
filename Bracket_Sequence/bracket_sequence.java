import java.util.Scanner;
import java.util.Stack;
public class Bracket_Sequence {
  private static boolean checkSequence(String string) {
    char[] str = string.toCharArray();
    char check;

    Stack stack = new Stack();

    for(char c: str) {
      if(c == '{' || c == '[' || c == '(') {
        stack.push(c);
      } else {
        if (!stack.isEmpty()) {
          check = (char) stack.pop();
          if (c == '}' && check != '{') {
            return false;
          } else if (c == ']' && check != '[') {
            return false;
          } else if (c == ')' && check != '(') {
            return false;
          }
        } else {
          return false;
        }
      }
    }
    
    if (!stack.isEmpty()) {
      return false;
    }
    return true;	
  }
  
  public static void main(String[] args) { 
    Scanner scan = new Scanner(System.in); 
    String string = scan.nextLine();
    
    System.out.print(checkSequence(string) ? "YES" : "NO");
  } 
}