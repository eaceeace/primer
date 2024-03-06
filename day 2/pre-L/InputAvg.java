/**
 * This program takes 10 integers from the keyboard and prints their average value.
 */
import java.util.Scanner;

public class InputAvg {
    public static void main(String[] args) {
        System.out.println("Enter 10 numbers:");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += arr[i];}
        float avg =  sum / 10;
        System.out.println("Average: " + avg);
    }
}
