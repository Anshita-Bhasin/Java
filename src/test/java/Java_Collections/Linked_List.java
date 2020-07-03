package Java_Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List {

    /*  LinkedList is a class which implements List Interface and Dequeue Interface
      It stores the data in node.1st part of node is data and 2nd part is next(next - reference of next node)
      1st node of linkedlist is head and last element is pointing to null
   */
    public static void main(String[] args) {

        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("Orange");
        l1.add("Hogarth");

        System.out.println(" printing Linkedlist " + l1);

        l1.addFirst("SSP");
        System.out.println(" printing Linkedlist after adding new first value " + l1);

        l1.addLast("Fidelity");
        System.out.println(" printing Linkedlist after adding new last value " + l1);

        l1.removeFirst();
        System.out.println(" printing Linkedlist after removing first value " + l1);

        l1.removeLast();
        System.out.println(" printing Linkedlist after removing last value " + l1);

        l1.set(0, "SSP");
        System.out.println(" printing Linkedlist after setting new value " + l1);

        System.out.println(" printing linkedlist using for loop");
        for (int i = 0; i < l1.size(); i++) {

            System.out.println(l1.get(i));
        }

        System.out.println(" printing linkedlist using for each");
        for (String s : l1) {

            System.out.println(s);
        }
        System.out.println(" printing linkedlist using iterator");
        Iterator<String> iterator = l1.iterator();
        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }
        System.out.println(" printing linkedlist using while loop");
        int num=0;
        while(l1.size()>num)
        {
            System.out.println(l1.get(num));
            num++;
        }
    }
}
