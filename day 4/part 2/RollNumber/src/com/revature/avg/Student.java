package com.revature.avg;

class Student{
    private int rollNumber;
    private String name;
    private int[] marks;


    public Student(int rollNumber, String name, int[] marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    public double Average() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return totalMarks / marks.length;
    }

    public void printd() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name : " + name);
        System.out.println("Average Marks : " + Average());
    }
}
