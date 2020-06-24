package Java_Questions;

public class FibonacciSeries {

    public static void main(String[] args) {
        int num = 10;
        int x = 0;
        int y = 1;

        for (int i = 1; i <= num; i++) {
            System.out.println(x);
            int sum = x+y;
            x=y;
            y=sum;


            //0 1 1 2 3 5 8 13 21 34

        }

    }
}
