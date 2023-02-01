package org.example;

import java.util.Comparator;

public class NameAgeComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee emp1, Employee emp2) {
        int flag = emp1.getSalary().compareTo(emp2.getSalary());
        if(flag == 0) {
            flag = emp1.getAge() - emp2.getAge();
        }
        return flag;
    }
}

