/* 3. Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s. */

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int odd = 0, positive = 0, negative = 0, even = 0, zero = 0;
        
        System.out.println("Enter 20 numbers:");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[20];
        
        for (int i = 0; i < 20; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            }
            if (arr[i] % 2 == 0 && arr[i] != 0) {
                even++;
            } else if (arr[i] != 0) {
                odd++;
            } else {
                zero++;
            }
        }
        scanner.close();
        System.out.println("Number of positive numbers: " + positive);
        System.out.println("Number of negative numbers: " + negative);
        System.out.println("Number of odd numbers: " + odd);
        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of zeros: " + zero);
    }
}

