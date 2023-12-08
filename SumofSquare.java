import java.util.Scanner;
public class SumofSquare{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" value of n: ");
        int n = sc.nextInt();

        int s = 0, i;
        for (i = 1; i <= n; i++) {
          s += i * i; 
        }
      System.out.println("Sum of squares: " + s); 
    }
}