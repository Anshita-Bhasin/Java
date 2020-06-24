package Java_Questions;

public class PowerConcept {

    public static void main(String[] args)
    {
        int base = 2;
        int exp=3;
        long result=1;
        while (exp!=0)
        {
        result=result*base;
        --exp;
        }


        System.out.println(base+ " to the power 3 is : " + result);
    }
}
