import java.util.Scanner;
public class Solution {
  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
 
    int n = scan.nextInt();
    int arr[] = new int[n];
    int temp;
 
    // Заполняем
    for(int i=0; i<n; i++) {
      arr[i] = scan.nextInt();
    }
    
    //Переворачиваем
    for(int i=0; i<n/2; i++) {
      temp = arr[i];
      arr[i] = arr[n-1-i];
      arr[n-1-i] = temp;
    }
    
    //Выводим
    for(int i=0;i<n;i++) {
      System.out.print(arr[i]+" ");
    }
  }
}