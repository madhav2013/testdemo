package com.capgemini.mthdref;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class InstanceMethod {
 
    public static void main(String a[]) {
 
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Kolaparthi", "Accounts", 8000));
        empList.add(new Employee("Amit", "Admin", 15000));
        empList.add(new Employee("Vasu", "Security", 2500));
        empList.add(new Employee("Srini", "Entertinment", 8500));
 
        MyExampComparator comp = new MyExampComparator();
 
        // sort it in method reference way
        System.out.println("<--- Sorted list with Method Reference --->");
        Collections.sort(empList, comp::compare);
        empList.forEach(System.out::println);
 
        // sort it in lambda expression way
        System.out.println("\n\n<--- Sorted list with Lambda expression --->");
        Collections.sort(empList, (emp1, emp2) -> comp.compare(emp1, emp2));
        empList.forEach(System.out::println);
    }
}