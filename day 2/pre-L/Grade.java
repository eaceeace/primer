/* A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade. */

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        System.out.println("Enter 5 subject's marks:");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt(); 
        }
        scanner.close();
        for (int i = 0; i < 5; i++) {
            if (arr[i] > 80) {
                System.out.println(arr[i] + "A");
            } else if (arr[i] >= 60) {
                System.out.println(arr[i] + "B");
            } else if (arr[i] >= 50) {
                System.out.println(arr[i] + "C");
            } else if (arr[i] >= 45) {
                System.out.println(arr[i] + "D");
            } else if (arr[i] >= 25) {
                System.out.println(arr[i] + "E");
            } else {
                System.out.println(arr[i] + "F");
            }
        }
    }
}
