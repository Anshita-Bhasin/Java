package Java_Questions;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAndIterator {

    public static void main(String[] args) {


    /* Static array is array which has fixed size.If array has size 4 and if you will add data in arr[4] which is position 5
    it will throw error - IndexOutOfBoundsException. Below is the example of static array
*/
        int[] a = new int[5];

/*Dynamic array came to overcome issue from static array. In dynamic array, there is no restriction of size.
 It's very easy to iterate dynamic array, there is no restriction that all the values should be of same datatype
 (untill there is no generic defined for that array), It can contain duplicate elements/value, Synchronized.

    .size() - for checking the size of array list
    To fetch value from any particular index, use .get()*/
        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add("QA");
        arr.add(true);

        System.out.println(" size of array is " + arr.size() + " And value at index2 is  :  " + arr.get(2));

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(" Finding out all the values of arraylist : " + arr.get(i));
        }

        //Generics - Means specific data type

        ArrayList<Integer> p = new ArrayList<Integer>();
        p.add(1);
        p.add(22);

        for (int i = 0; i < p.size(); i++) {
            System.out.println(" Integer Array " + p.get(i));

        }

        Employee e1 = new Employee("Anshita", 27, "QA");
        Employee e2 = new Employee("Ankita", 25, "Finance");
        Employee e3 = new Employee("Abha", 21, "Intern-Dev");

        ArrayList<Employee> emp = new ArrayList<Employee>();
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);

        Iterator<Employee> employeeIterator = emp.iterator();

        while (employeeIterator.hasNext()) {
            Employee employee = employeeIterator.next();
            System.out.println(
                " Printing values of employee class using Iterator " + employee.dept + " " + employee.age + " " + employee.name);
        }

        // addall

        ArrayList<String> s1= new ArrayList<String>();
        s1.add("Chemistry");
        s1.add("Physics");
        s1.add("Maths");

        ArrayList<String> s2 = new ArrayList<String>();
        s2.add("TheoryOfAutomata");
        s2.add("Data Structures");


        s2.addAll(s1);

        for(int i=0;i<s2.size();i++)
        {

            System.out.println(" array list using add all " + s2.get(i));
        }

    }
}
