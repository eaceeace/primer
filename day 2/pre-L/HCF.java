/* Write a program to find greatest common divisor (GCD) or highest common factor (HCF) of given two numbers */
import java.util.Scanner;
public class HCF{
    public static void main(String[] args) {
        int num1, num2, hcf = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        scanner.close();
        int min;
        if (num1 > num2) {
            min = num2;
        } else {
            min = num1;
        }
        for (int i = 1; i <= min; ++i) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("The HCF is : " + hcf);
    }
}
