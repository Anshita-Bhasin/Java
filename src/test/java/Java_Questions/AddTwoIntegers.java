package Java_Questions;

import java.util.Scanner;

public class AddTwoIntegers {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(" Addition of two numbers is : " + (a + b));

        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the numbers for addition ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("Addition of entered numbers is : " + (num1 + num2));

    }

}
