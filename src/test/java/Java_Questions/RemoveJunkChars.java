package Java_Questions;

public class RemoveJunkChars {
    public static  void main (String[] args)
    {

        String a ="%^%^%@^@#%@^(()testing)(@anshita*&&##&#&";

        String s=a.replaceAll("[^a-zA-Z0-9]","-");
        System.out.println(" Removing junk characters from " + a + " and the result is : " +s);



    }

}
