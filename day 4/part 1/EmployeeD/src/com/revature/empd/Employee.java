package com.revature.empd;

public class Employee {
    int year;
    String name;
    String address;

    public Employee(String name,int year, java.lang.String address) {

        this.name = name;
        this.year = year;
        this.address = address;
    }
    void printd(){
        System.out.println("Name : "+name+" year : "+year+" address : "+ address);
    }
}

