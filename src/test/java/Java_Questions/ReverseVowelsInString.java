package Java_Questions;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsInString {

    public static String reverseVowel(String s) {
        Set<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('A');
        vowels.add('e');
        vowels.add('E');
        vowels.add('i');
        vowels.add('I');
        vowels.add('o');
        vowels.add('O');
        vowels.add('u');
        vowels.add('U');
        char[] characters = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (i < j && !vowels.contains(characters[i])) {
                i++;
            }
            while (i < j && !vowels.contains(characters[j])) {
                j--;
            }
            char temp = characters[i];
            characters[i++] = characters[j];
            characters[j--] = temp;
        }
        System.out.println(" reverse " + new String(characters));
        return new String(characters);
    }


    public static void main(String args[]) {
        System.out.println(
    reverseVowel("hello"));

    }

}
