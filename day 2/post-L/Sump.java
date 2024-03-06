/*5. Write a program to find the sum and product of all elements of an array */


import java.util.Scanner;
public class Sump{
    public static void main(String[] args) {
        int sum=0;
        double product=1;
        System.out.println("Enter 10 numbers");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt(); 
        }
        for (int i = 0; i < 10; i++) {
            sum += arr[i];
            product *= arr[i];
        }
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);
    }
}