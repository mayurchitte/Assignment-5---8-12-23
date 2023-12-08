
import java.util.Scanner;
public class Fibonacci {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println(" No1 :");
    int  n1= sc.nextInt();
    
    System.out.println(" No2 :");
    int n2 = sc.nextInt();
    
    int a = 0;
    int b = 1;
    for (int i = 0; i < n2; i++) {
      if (a >= n1) {
        System.out.println(a);
      }
      int fib = b;
      b = a + b;
      a = fib;
    }
  }
}