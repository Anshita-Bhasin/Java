package Java_Questions;

import java.util.stream.IntStream;

public class PrintDigitsWithoutUsingNumbers {


public static void main(String[] args) {

    System.out.println(" Solution 1");
    /* Solution 1 */
    String AB = "a";
    for (int i = AB.length(); i < 'e'; i++) {


        System.out.println(i);

    }

    System.out.println(" Solution 2");

    /* Solution 2 */

    for (int i = 'A' / 'A'; i < 'e'; i++) {


        System.out.println(i);


    }


    System.out.println(" Solution 3");

    /* Solution 3 */

    IntStream.range(1,101).forEach(i-> System.out.println(i));


}




}
