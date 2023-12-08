import java.util.Scanner;
public class SumofSeries {
   public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println(" value of n: ");
    int n = sc.nextInt();

    double s = 0.0; 
    double i;
    for (i = 1; i <= n; i++) {
          s = s + 1/i; 
    }
      System.out.println("The sum of the series is: " + s);
   }
}