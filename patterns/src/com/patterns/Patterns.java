package com.patterns;

import java.util.Scanner;
import static com.patterns.SPatterns.*;

public class Patterns {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for triangle patterns: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the side length for square pattern: ");
        int side = scanner.nextInt();
        scanner.close();

        System.out.println("\n1. Left Triangle Star Pattern:");
        leftTriangle(rows);

        System.out.println("\n2. Square Star Pattern:");
        square(side);

        System.out.println("\n3. Right Triangle Star Pattern:");
        rightTriangle(rows);

        System.out.println("\n4. Right Down Triangle Star Pattern:");
        rightDownTriangle(rows);


        System.out.println("\n5. Left Down Triangle Star Pattern:");
        leftDownTriangle(rows);

        System.out.println("\n6. Hollow Triangle Star Pattern:");
        hollowTriangle(rows);

        System.out.println("\n7. Hollow Pyramid Star Pattern:");
        hollowPyramid(rows);

        System.out.println("\n8. Hollow Square Star Pattern:");
        hollowSquare(side);

        System.out.println("\n9. Down Pyramid Star Pattern:");
        downPyramid(rows);

    }
}
