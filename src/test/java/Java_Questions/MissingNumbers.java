package Java_Questions;

public class MissingNumbers {

    public static void main(String[] args) {
        //int [] a = { 1, 2, 4, 5 };
        int[] a = new int[]{1, 2, 3, 5};

        int sum = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];

        }
        for (int j = 1; j <= a.length + 1; j++) {

            x = x + j;
        }

        y = x - sum;
        System.out.println(" missing number is " + y);

        System.out.println(" Missing number using function " + getMissingNumber(a,a.length+1));
    }


    public static int getMissingNumber(int[] x,int length)
    {
        int expected = length*((length+1)/2);//4*5/2=4*2.5=10
        int actual =0;
        for(int j : x)
        {
            actual=actual+j;//12
        }
        int result=expected-actual;//12-
        return result;
    }
}