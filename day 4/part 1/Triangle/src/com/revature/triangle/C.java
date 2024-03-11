package com.revature.triangle;

public class C{
        public static void main(String[] args) {
            Triangle triangle = new Triangle(3, 4, 5);
            System.out.println("Area of the triangle: " + triangle.calculateArea());
            System.out.println("Perimeter of the triangle: " + triangle.calculatePerimeter());
        }
}

