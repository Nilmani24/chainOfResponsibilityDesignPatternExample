package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManagement {
    private static List<Employee> employeeList = new ArrayList<>();
    public static boolean addEmployee(Employee employee){
        employeeList.add(employee);
        return true;
    }
    public static List<Employee> filterEmployeeByLevel(int level){
        return employeeList.stream().filter(e ->e.getLevel() == level).collect(Collectors.toList());
    }

}
