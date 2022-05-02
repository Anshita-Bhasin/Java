package Java_Questions;

public class Armstrong {

    public static void main(String[] args)
    {
        int num = 153;
        int number=num;
        int rev=0;
        int sum;
        while(num!=0)
        {
            sum=num%10;//1
            num=num/10;
            rev=rev+(sum*sum*sum);
        }
        System.out.println(number + " is "+ (number==rev?" an armstrong number " : " not an armstrong number"));
    }




    }



