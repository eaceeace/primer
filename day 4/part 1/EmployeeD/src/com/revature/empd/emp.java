package com.revature.empd;

public class emp {
    public static void main(String[] args) {
        Employee[] emp = new Employee[3];
        emp[0] = new Employee("Robert", 1994, "64C- WallsStreet");
        emp[1] = new Employee("Sam", 2000, "68D- WallsStreet");
        emp[2] = new Employee("John", 1999, "26B- WallsStreet");

        for (Employee e : emp) {
            e.printd();
        }
    }
}
