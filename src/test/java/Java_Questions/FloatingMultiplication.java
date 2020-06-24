package Java_Questions;

import java.util.Scanner;

public class FloatingMultiplication {
    public static void main(String[] args) {
        float a = 2.4f;
        float b = 9.9f;

        System.out.println(" Multiplication of two floating numbers is : " + (a * b));

        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the numbers ");
        float num1 = in.nextFloat();
        float num2 = in.nextFloat();

        System.out.println(" Multiplication of the entered numbers is : " + (num1 * num2));

    }

}
