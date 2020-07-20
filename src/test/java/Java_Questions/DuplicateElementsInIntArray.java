
package Java_Questions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInIntArray {
    public static void main(String[] args) {


         int a[]={1,2,4,5,1};

        //Method 1 - Complexity - O(n*n)
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                }
            }
        }

        System.out.println(" ********Using HashSet***********");


        //Method 2 - Complexity - O(n) using HashSet. HashSet do not contain duplicate elements
        Set<Integer> s1 = new HashSet<Integer>();
        for (Integer s : a) {
            if (s1.add(s) == false) {
                System.out.println(s);
            }
        }

    }
}