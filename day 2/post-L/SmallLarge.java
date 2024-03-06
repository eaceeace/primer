/*7. Find largest and smallest elements of an array. */
import java.util.Scanner;
public class SmallLarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int l = arr[0];
        int s = arr[0];
        for (int i = 1; i < 10; i++) {
            if (arr[i] > l) {
                l = arr[i];
            }
            if (arr[i] < s) {
                s = arr[i];
            }
        } 
        System.out.println(" Largest element :  " + l+"  Smallest element :  " + s);
    }
}
