package Java_Questions;

public class Palindrome {

    public static void main(String[] args) {
        int num = 1251;
        int number = num;
        int rev = 0;
        int x = 0;

        while (num != 0) {
            x = num % 10;//1
            rev = rev * 10 + x;//1
            num = num / 10;//122

        }




        System.out.println(number + " is " + ((number == rev) ? " palindrome  " : " not palindrome"));
    }

}
