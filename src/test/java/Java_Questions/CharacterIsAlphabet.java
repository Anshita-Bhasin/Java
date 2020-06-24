package Java_Questions;

public class CharacterIsAlphabet {
    public static void main(String[] args)
    {

         char a ='e';

        System.out.println( a + " is " + ((a>='A' && a<='Z')|| (a>='a' && a<='z')?" alphabet " : " not an alphabet"));

    }
}
