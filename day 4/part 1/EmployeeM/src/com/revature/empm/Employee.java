
package com.revature.empm;

public class Employee {
    private double salary; // Changed to double
    private int hoursOfWork;

    public Employee(double salary, int hoursOfWork) { // Changed parameters to double and int
        this.salary = salary;
        this.hoursOfWork = hoursOfWork;
    }

    public void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

    public void addWork() {
        if (hoursOfWork > 6) {
            salary += 5;
        }
    }

    public double getFinalSalary() { // Changed return type to double
        return salary;
    }
}