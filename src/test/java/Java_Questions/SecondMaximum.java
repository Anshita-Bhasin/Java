package Java_Questions;

import java.util.Arrays;
import java.util.Scanner;
// Other imports go here
// Do NOT change the class name

public class SecondMaximum {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int values[] = new int[length];
        int sort[] = new int[0];

        for (int i = 0; i < length; i++) {
            values[i] = sc.nextInt();

        }
       /* 1st method


       Arrays.sort(values);
        int second_maximum=values[length-2];
        System.out.printf("values of array " + Arrays.toString(values)+" second max "+ second_maximum);
        */

        System.out.printf("Before " + Arrays.toString(values));
/* second method */

        for(int i=0;i<length-1;i++)
        {
            for(int j=i+1;j<length;j++)
            {
            if(values[i]>values[j])
            {
                values[i]=values[i]+values[j];
                values[j]=values[i]-values[j];
                values[i]=values[i]-values[j];
                //10 20 a=10+20 b=a-b=10 a=30-b

            }

        }}

        System.out.printf("array is " + Arrays.toString(values) +"second largest" + values[length-2]);



        // Write your code here
        //third method
        /*Scanner sc = new Scanner(System.in);
        int a[]=new int[5];
        int max=0;
        int index=0;
        int temp=0;


        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();

        }
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(a[i]==a[j])
                {
                    break;
                }
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }



        }

        System.out.println(a[3]);*/
    }
}

