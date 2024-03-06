/* Print the following patterns using loop :
a.
*
**
***
**** */
import java.util.Scanner;
public class Pattern{
    public static void main(String[] args) {
        int row;
        System.out.println("Enter number of rows");
        Scanner scanner = new Scanner(System.in);
        row= scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
