package Java_Questions;

public class SwapString {

    public static void main(String[] args) {

        String a = "Hello";
        String b = "World";
        System.out.println(" Before swapping , a is " + a + " and b is " + b);
        b = a + b;
        a = b.substring(a.length());

        b = b.substring(0, b.length() - a.length());
        System.out.println("after swapping , a is " + a + " and b is " + b);



    }

}
