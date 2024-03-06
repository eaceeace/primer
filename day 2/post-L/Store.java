/*1. Take 10 integer inputs from user and store them in an array and print them on screen.*/
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        System.out.println("Enter 10 numbers");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt(); 
        }
        scanner.close();
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
