package Java_Questions;

public class ReverseNumber {

    public static  void main(String [] args)
    {
        int num = 15778;
        int reverse=0;
        while (num!=0)
        {
            int n =num%10;
            reverse=reverse*10+n;
            num=num/10;

        }

        System.out.println(" reverse of " + num + " is " + reverse);

    }
}

