package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Gozie", 45000.00, 27, 4 ));
        emp.add(new Employee("Odinaka", 36000.00, 30, 5));
        emp.add(new Employee("Kene", 24000.00, 26, 2));
        emp.add(new Employee("Sylvia", 18000.00, 30,3));
        emp.add(new Employee("Kene", 45000.00, 29,4));

        Collections.sort(emp, new NameAgeComparator());



        System.out.println(emp);
    }

}