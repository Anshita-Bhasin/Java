package Java_Collections;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {

    public static void main(String[] args) {

       /* Hahmap is a class which implements Map Interface
       It is non synchronised. Multiple threads can access it at the same time
       Not Thread safe
       Maintains no order
       Single Null Key, Multiple Null Values
       Stores value in key, value pair
       It contains unique values
       High Performance

       Iterator is used to iterate the values

       There is one problem of concurent modification exception  - fail fast (Any thread modifies the structure
       at the same time which updates the map)
       which occur because as hashmap is non sync call, so at the same time, 2 threads can access 1 value
       and let's say, 1st thread removes the value and 2nd thread is reading that value. so, in that
       case, concurent modification exception will occur which is fail fast condition
        */
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "Orange");
        hashMap.put(2, "Emirates");
        hashMap.put(3, "Fidelity International");
        hashMap.put(4, "Fidelity International");

        System.out.println(" printing hashmap " + hashMap);
        System.out.println("printing hashmap values only");

        /*for loop can not be used for iterating hashmap always. in the below example, it is working fine
         as this hashmap is of integer and string type so, for all integers, we are iterating but if hashmap is
        of type string,string then for loop cannot be used.*/
        for (int i = 1; i < hashMap.size(); i++) {
            System.out.println(hashMap.get(i));
        }
        for (Map.Entry m : hashMap.entrySet()) {
            System.out.println(" hashmap key : ");
            System.out.println(m.getKey());
            System.out.println(" hashmap value ");
            System.out.println(m.getValue());

        }

        hashMap.remove(4);
        System.out.println(" after removing key - 4 " + hashMap);
        Employee e1 = new Employee("Anshita", 27, "QA");
        Employee e2 = new Employee("Ankita", 25, "Finance");
        Employee e3 = new Employee("Abha", 21, "Intern-Dev");

        HashMap<String, Employee> employeeHashMap = new HashMap<String, Employee>();
        employeeHashMap.put("First", e1);
        employeeHashMap.put("Second", e2);
        employeeHashMap.put("Third", e3);

        //Entry is a interface which is used to traverse hashmap

        for (Map.Entry<String, Employee> e : employeeHashMap.entrySet()) {
            Employee t = e.getValue();
            System.out.println(e.getKey() + " --- " + t.dept + "----" + t.name + " ------" + t.age);
        }

    }
}
