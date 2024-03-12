package com.revature.collsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

public class empdata {
    private List<Employee> data = new ArrayList<>();
    public void addEmployee(int empid, String name, double salary) {
        Employee emp = new Employee(empid, name, salary);
        data.add(emp);
    }
    public List<Employee> getEmployees() {
        return data;
    }
    public static void main(String[] args) {
        empdata emp = new empdata();
        emp.addEmployee(101, "John", 50000);
        emp.addEmployee(102, "Alice", 60000);
        emp.addEmployee(103, "Bob", 55000);
        Collections.sort(emp.getEmployees(), Comparator.comparingInt(Employee::getEmpid));
        System.out.println("Sorted List of Employees:");
        for (Employee i : emp.getEmployees()) {
            System.out.println(i);
        }

}}