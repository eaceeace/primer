/* 1. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user. */
import java.util.Scanner;

public class Maxmin {
    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; 
            }
        }
        return max;
    }
    public static int min(int[] arr) {
        int min = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min; 
    }
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers:");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int mx = max(arr);
        int mn = min(arr);

        // Print the maximum and minimum numbers
        System.out.println("Maximum number: " + mx);
        System.out.println("Minimum number: " + mn);
    }
}
