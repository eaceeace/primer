package com.revature.collsort;

public class Employee {
    private int empid;
    private String name;
    private double salaray;

    public int getEmpid() {
        return empid;
    }

    public java.lang.String getName() {
        return name;
    }

    public double getSalaray() {
        return salaray;
    }

    public Employee(int empid, java.lang.String name, double salaray) {
        this.empid = empid;
        this.name = name;
        this.salaray = salaray;

    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name=" + name +
                ", salaray=" + salaray +
                '}';

        }
    }

