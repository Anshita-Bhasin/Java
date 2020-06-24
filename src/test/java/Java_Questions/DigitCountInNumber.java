package Java_Questions;

public class DigitCountInNumber {

    public static void main(String[] args)
    {
        int num = 01;

        String a =String.valueOf(num);

        System.out.println(" Total digits in " + num + " is " +( (num==0)?" 0 " : a.length()));
    }
}
