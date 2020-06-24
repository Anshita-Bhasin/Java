package Java_Questions;

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        int a = 22;
        int b = 33;

        System.out.println(a + " is  " + (a % 2 == 0 ? "even " : " odd"));
        System.out.println(b + " is  " + (b % 2 == 0 ? "even " : " odd"));

        System.out.println(" Enter the numbers");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println(num1 + " is  " + (num1 % 2 == 0 ? "even " : " odd"));
        System.out.println(num2 + " is  " + (num2 % 2 == 0 ? "even " : " odd"));

    }

}
