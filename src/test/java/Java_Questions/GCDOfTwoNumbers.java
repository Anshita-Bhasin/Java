package Java_Questions;

import java.util.Scanner;

public class GCDOfTwoNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Enter the numbers ");
        int a = s.nextInt();
        int b = s.nextInt();
        int gcd = 1;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;

            }
        }
        System.out.println("Without Recursion -- GCD of  " + a + " and " + b + " is " + gcd);
        System.out.println("With Recursion -- GCD of  " + a + " and " + b + " is " + recursionGCD(a, b));

    }

    public static int recursionGCD(int x, int y) {
        if (y != 0) {
            return recursionGCD(y, x % y);
        } else {
            return x;
        }
    }


}
