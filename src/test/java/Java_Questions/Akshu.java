package Java_Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Akshu {


    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Scanner sc = new Scanner(System.in); //5
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> arr = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());

            }
            list.add(arr);
            int q = sc.nextInt();
            for (int i = 0; i < 5; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (b > list.get(a-1).size() ) {
                    System.out.println("ERROR!");
                } else {
                    System.out.println(list.get(a - 1).get(b - 1));
                }


            }


        }
    }
}


