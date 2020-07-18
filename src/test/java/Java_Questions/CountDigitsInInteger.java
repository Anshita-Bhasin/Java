package Java_Questions;

import java.util.Scanner;

public class CountDigitsInInteger {

    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = s.nextInt();
        int count=0;

        while(a!=0)
        {
            a =a/10;
            ++count;

        }

        System.out.println(" number of digits " + count);
    }
}
