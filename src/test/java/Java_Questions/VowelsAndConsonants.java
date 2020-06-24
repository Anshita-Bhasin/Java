package Java_Questions;

import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        String b = in.next();
        char a='c';

        System.out.println( " a is : " + ((a=='a' || a=='e' || a=='i' || a=='o' || a=='u')?"vowel":"consonant"));


    }

}
