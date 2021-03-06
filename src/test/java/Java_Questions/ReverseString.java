package Java_Questions;

public class ReverseString {
    private static String rev = " ";

    public static void main(String[] args) {

        System.out.println(" HowToDoInJava is palindrome --> " + VerifyReverse("HowToDoInJava"));
        System.out.println(" abcba is palindrome -->  " + VerifyReverse("abcba"));

        System.out.println(" Reverse of Selenium is --> " + verifyRev("Selenium"));

        String st = " I.Love.Programming";

        String reverse = new StringBuilder(st)
            .reverse()
            .toString();
        System.out.println(" ------------ " + reverse);

    }

    public static boolean VerifyReverse(String originalString) {
        String reverse = new StringBuilder(originalString)
            .reverse()
            .toString();
        return originalString.equals(reverse);
    }

    public static String verifyRev(String originalString) {
        int len = originalString.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + originalString.charAt(i);
        }

        return rev;
    }

}






















