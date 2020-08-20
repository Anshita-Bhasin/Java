package Java_Questions;

import java.util.Scanner;

public class CountVowelsInString {

    public static void main(String args[])
    {

        Scanner s= new Scanner(System.in);
        String s1=s.nextLine();
        char[] c = s1.toCharArray();
        int count=0;

        for (char c1:c)
        {
            if(c1=='a'||c1=='A'||c1=='e'||c1=='E'||c1=='o'||c1=='O'||c1=='i'||c1=='I'||c1=='u'||c1=='U')
            {
                count++;
            }
        }
        System.out.println(" number of vowels in string is " + count



        );

    }

}
