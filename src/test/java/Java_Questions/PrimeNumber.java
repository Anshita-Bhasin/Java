package Java_Questions;

public class PrimeNumber {

    public static void main(String[] args) {
        int num = 1;
        boolean flag=false;

        for (int n = 2; n < num/2; n++) {

            if (num % n == 0)
            {
                flag = true;
                break;
            }
        }
        if(!flag)
        {
            System.out.println(num + " is a prime number");
        }
        else
        {
            System.out.println(num + " is not a prime number");
        }

    }
}
