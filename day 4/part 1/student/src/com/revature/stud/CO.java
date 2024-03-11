package com.revature.stud;

public class CO{
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Sam";
        student1.roll_no = 1;
        Student student2 = new Student();
        student2.name = "John";
        student2.roll_no = 2;
        System.out.println("Student 1: Name - " + student1.name + ", Roll Number - " + student1.roll_no);
        System.out.println("Student 2: Name - " + student2.name + ", Roll Number - " + student2.roll_no);
    }
}
