/* 1010101
    10101 
     101  
      1    */

import java.util.Scanner;

public class PatternB {
    public static void main(String[] args) {
        int row;
        System.out.println("Enter the number of rows:");
        Scanner scanner = new Scanner(System.in);
        row = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
            System.out.print(" ");
            }
            for (int j = 0; j < (row - i) * 2 - 1; j++) {
            System.out.print(j % 2 == 0 ? "1" : "0");
            }
            System.out.println();
        }
        
    }
}

