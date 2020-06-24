package Java_Questions;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println(" Enter two numbers");
        double first = in.nextDouble();
        double second = in.nextDouble();
        System.out.println(" Select operator : (+,-,*,/) : ");
        char operator = in
            .next()
            .charAt(0);
        double result = 0;

        switch (operator) {
            case '+':
                result = first + second;
                System.out.println(result);
                break;

            case '-':
                result = first - second;
                System.out.println(result);
                break;

            case '*':
                result = first * second;
                System.out.println(result);
                break;

            case '/':
                result = first / second;
                System.out.println(result);
                break;


            default:
                System.out.println(" Please pass the operator ");
                break;
        }

    }
}
