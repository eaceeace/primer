/*  Initialize and print all elements of a 2D array.*/
import java.util.Scanner;

public class TwoD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[5][5];
        System.out.println("Enter 9 numbers:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Elements of the 2D array:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
