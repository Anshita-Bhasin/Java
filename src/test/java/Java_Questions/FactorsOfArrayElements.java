package Java_Questions;

import java.util.Scanner;

public class FactorsOfArrayElements {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Enter the number of elements separated by space");
        int x=s.nextInt();

       int a[]=new int[x];

       for(int i =1;i<s.nextInt();i++)
       {
           a[i]=s.nextInt();
           if(a[i]%i==0)
           {
               System.out.println(" factor " + i);
           }
       }



    }

}
