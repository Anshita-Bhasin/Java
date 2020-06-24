package Java_Questions;

public class MultiplicationTable {

    public static void main(String[] args)
    {
        int a =7;
        int multiply = 0;
        System.out.println(" Table of " + a + " is --> ");

        for(int i =1; i<=10 ; i ++)
        {
            multiply=a*i;

            System.out.println( a + " * " + i + " is = " + multiply);

        }


    }
}
