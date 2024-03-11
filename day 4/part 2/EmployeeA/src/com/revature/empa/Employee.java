
package com.revature.empa;
class Employee{
    private String name;
    private double salary;
    private int dateOfJoining;

    public Employee(String name, double salary, int dateOfJoining) {
        this.name = name;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getDateOfJoining() {
        return dateOfJoining;
    }
}
