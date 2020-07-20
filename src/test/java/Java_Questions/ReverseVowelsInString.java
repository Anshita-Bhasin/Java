package Java_Questions;

import java.util.Scanner;

public class ReverseVowelsInString {

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String a=s.nextLine();
        String rev = " ";
//12,12>

        System.out.println(" String is " + a);

        for(int i =a.length()-1;i>=0;i--)
        {
            char b = a.charAt(i);
            if(b=='a'||b=='A'||b=='e'||b=='E'||b=='i'||b=='I'||b=='o'||b=='O'||b=='u'||b=='U' )
            {
            rev=rev+a.charAt(i);

        }

    }
        System.out.println(" Reverse of string " + rev);
}

public boolean checkVowel(char x)
{
    return (x=='a'||x=='A'||x=='e'||x=='E'||x=='i'||x=='I'||x=='o'||x=='O'||x=='u'||x=='U' );

}
}
