package com.revature.empa;

import java.util.Scanner;

public class Empa{
        public static void main(String[] args) {
            Employee[] employees = new Employee[1];
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 1; i++) {
                System.out.println("Enter details for employee : ");
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.println("\n");
                System.out.print("Salary: ");
                double salary = scanner.nextDouble();
                System.out.print("Date of Joining : ");
                int dateOfJoining = scanner.nextInt();
                employees[i] = new Employee(name, salary, dateOfJoining);
            }
            scanner.close();
            System.out.println("Employee Details : ");
            for (Employee employee : employees) {
                printEmp(employee);
            }
        }
        private static void printEmp(Employee employee) {

            System.out.println("Name: " + employee.getName() +
                    " Salary : " + employee.getSalary() +
                    "Date of Joining : " + employee.getDateOfJoining());
        }
    }

