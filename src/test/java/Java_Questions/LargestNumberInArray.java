package Java_Questions;

public class LargestNumberInArray {

    public static void main(String[] args) {


        int[] a = {0, 33, 89, 90, 2, -6, -7};
        int largest = a[0];
        int smallest = a[0];

        for (int i = 1; i <= a.length-1; i++)
        {
            if (a[i] > largest)
            {
                largest = a[i];
            }
            else if (a[i] < smallest)
            {
                smallest = a[i];
            }

        }


        System.out.println(" largest number is " + largest);
        System.out.println(" smallest number is " + smallest);

    }


}
