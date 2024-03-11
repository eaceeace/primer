package com.revature.avg;
import java.util.Scanner;
public class stud {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Student[] students = new Student[8];
            for (int i = 0; i < 8; i++) {
                System.out.println("Enter details for Student :");
                System.out.print("Roll Number: ");
                int rollNumber = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Name: ");
                String name = scanner.nextLine();
                int[] marks = new int[3];
                System.out.print("Subject 1: ");
                marks[0] = scanner.nextInt();
                System.out.print("Subject 2: ");
                marks[1] = scanner.nextInt();
                System.out.print("Subject 3: ");
                marks[2] = scanner.nextInt();
                students[i] = new Student(rollNumber, name, marks);
            }
            scanner.close();
            for (Student student : students) {
                student.printd();
                System.out.println();
            }
        }
    }

