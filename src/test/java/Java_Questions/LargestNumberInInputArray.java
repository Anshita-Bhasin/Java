package Java_Questions;

import java.util.Scanner;

public class LargestNumberInInputArray {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.println(" Enter the length of array");

        int x = s.nextInt();
        System.out.println(" Enter the elements of array");
        int[] a = new int[x];
        int smallest = 0;
        int largest = 0;

        for (int i = 0; i < x; i++) {
            a[i] = s.nextInt();

            largest = a[0];
            smallest = a[0];


            for (int j = 1; j <= x-1; j++) {
                if (a[j] > largest)
                {
                    largest = a[j];
                }
                else if (a[j] < smallest)
                {
                    smallest = a[j];
                }
            }

        }
        System.out.println(" largest is " + largest);
        System.out.println(" smallest is " + smallest);


    }
}
