/*1. Take 10 integer inputs from user use varargs and store them in an array and print the avg.*/
import java.util.Scanner;

public class Varargs{
    public static float Avg(int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;  }
        return sum / (float) arr.length; }
    public static void main(String[] args) {
        System.out.println("Enter 10 numbers:");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();   }
        scanner.close();
        float average = Avg(arr);
        System.out.println("Average: " + average);
    }
}
