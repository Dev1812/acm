import java.util.Scanner; 
public class InitClass {
  public static void main(String[] args) throws Exception { 
    Scanner scan = new Scanner(System.in); 
    
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int v1 = 0;//Объём 1
    int v2 = 0;//Объём 2
  
    if(c-(a+b) <= 150-a){
      v1 = c-(a+b);
    } else {
      v1 = 150-a;
      v2 = c-(a+b)-v1;
    }

    System.out.print(v1+" "+v2);  
  } 
} 