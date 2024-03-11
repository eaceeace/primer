package com.revature.arearect;
import java.util.Scanner;
public class co {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter length of rectangle: ");
            double length = scanner.nextDouble();
            System.out.print("Enter breadth of rectangle: ");
            double breadth = scanner.nextDouble();
            Area rectangle = new Area(length, breadth);
            System.out.println("Area of rectangle: " + rectangle.returnArea());
            scanner.close();
        }
    }

