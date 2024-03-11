package com.revature.empm;

import java.util.Scanner;

public class empm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary and hours of work per day: ");
        int salary = sc.nextInt();
        int hoursOfWork = sc.nextInt();
        sc.close();
        Employee emp = new Employee(salary, hoursOfWork); 
        emp.addSal();
        emp.addWork();
        System.out.println("Final Salary: " + emp.getFinalSalary());
    }
}

