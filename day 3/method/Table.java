
/*Print the multiplication table of 15 using recursion. */
import java.util.Scanner;
public class Table {
    public static void print(int num, int i) {
        if (i <= 15) {
            System.out.println((num *i));
            print(num, i+ 1); 
        }
    }

    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number : ");
        Scanner s= new Scanner(System.in);
        num= s.nextInt();
        s.close();
        System.out.println("Multiplication table of " + num);
        print(num, 1);
    }
}