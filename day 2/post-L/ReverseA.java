/*4. Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order.
  */

import java.util.Scanner;
public class ReverseA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int[] arr2 = new int[10];
         int[] arr1 = new int[10];
         int i,j=0;

        System.out.println("Enter 10 numbers:");
       
        for ( i = 0; i < 10; i++) {
            arr1[i] = scanner.nextInt();
        }
        scanner.close();
        for ( i = 9; i >= 0; i--) {
            arr2[j] = arr1[i];
            j++;
        }
        for ( i = 0; i < 10; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for ( i = 0; i < 10; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}