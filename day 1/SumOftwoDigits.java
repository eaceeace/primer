/* Write a program to calculate the sum of the first and the second last digit of a 5 digit. E.g.- NUMBER : 12345        OUTPUT : 1+4=5  Input the number using scanner.*/

import java.util.Scanner;
public class SumOftwoDigits{
    public static void main(String[] args) {
        int number, sum = 0, n,m;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        number = scanner.nextInt();
        scanner.close();
        m= number/ 10000;
        n= ((number/10)%10);
        sum= m+n;
        System.out.println("Output: " + sum);
    }
}