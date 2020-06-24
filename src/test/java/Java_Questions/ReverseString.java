package Java_Questions;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println(" HowToDoInJava is palindrome --> " + VerifyReverse("HowToDoInJava"));
        System.out.println(" abcba is palindrome -->  " + VerifyReverse("abcba"));

    }

    public static boolean VerifyReverse(String originalString) {
        String reverse = new StringBuilder(originalString)
            .reverse()
            .toString();
        return originalString.equals(reverse);
    }

}
