import java.util.Scanner;

public class PowerOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" base number: ");
        int x1 = sc.nextInt();

        System.out.println(" exponent: ");
        int x2 = sc.nextInt();

        int result = 1;

       
        for (int i = 0; i < x2; i++) {
            result *= x1;
        }

        System.out.println(x1 + " raised to the power of " + x2 + " is: " + result);
    }
}
