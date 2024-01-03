package jan2.comparisondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeList {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Peter", 23));
        employees.add(new Employee("Sam", 45));
        employees.add(new Employee("Kash", 33));
        employees.add(new Employee("Tim", 54));
        employees.add(new Employee("Tom", 43));
        Collections.sort(employees);
        System.out.println(employees);

     // lexicographically
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(450);
        list.add(50);
        list.add(110);
        Collections.sort(list);
        System.out.println(list);
    }
}
// Comparable (compareTo()) vs comparator (compare())