 
 import java.util.Scanner;
 public class EvenFibonacci {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println(" No1 :");
       int n1 = sc.nextInt();
    
       System.out.println(" No2 :");
       int n2 = sc.nextInt();  
       int count = 0;

        for (int i = 0; i < 10; i++) {
            
            if (n2 % 2 == 0) {
                System.out.println(n2);
                count++;
            }

            int next = n1 + n2;
            n1 = n2;
            n2 = next;
        }
    }
}
