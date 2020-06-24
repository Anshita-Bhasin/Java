package Java_Questions;

public class SwapNumbers {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(" --------Swapping of numbers using temp variable-------");
        System.out.println(" Numbers before swap : " + a + " and " + b);

        int temp = a;
        a=b;
        b = temp;


        System.out.println(" Numbers after swap  : " + a + " and " + b);

        System.out.println(" --------Swapping of numbers without using temp variable-------");
        System.out.println(" Numbers before swap : " + a + " and " + b);


        a= a+b;
        b = a-b;
        a=a-b;


        System.out.println(" Numbers after swap  : " + a + " and " + b);
    }
}
