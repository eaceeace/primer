/* Write a program to reverse a 3-digit number.  E.g.-Number : 132        Output : 231 Input the number using scanner.*/

import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        int number, rev = 0, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        number = scanner.nextInt();
        scanner.close();
        for (int i = number; i != 0; i /= 10) {
            n = i % 10;
            rev = rev * 10 + n;}
        System.out.println("Output: " + rev);
    }
}
