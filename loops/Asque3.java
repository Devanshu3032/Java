import java.util.Scanner;

public class Asque3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int n = sc.nextInt();

        System.out.println("Enter the second number:");
        int b = sc.nextInt();

        // Calculate GCD using Euclidean algorithm
        int gcd = calculateGCD(n, b);

        System.out.println("The GCD of " + n + " and " + b + " is: " + gcd);
    }

    // Recursive method to find GCD
    private static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }
}
