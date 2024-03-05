/* Write a program to calculate the sum of the digits of a 3-digit number. Number : 132        Output : 6 Input the number using scanner.*/
import java.util.Scanner;
public class SumOfDigits{
    public static void main(String[] args) {
        int number, sum = 0, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        number = scanner.nextInt();
        scanner.close();
        for (int i = number; i != 0; i /= 10) {
            n = i % 10;
            sum+=n;
        }
        System.out.println("Output: " + sum);
    }
}
