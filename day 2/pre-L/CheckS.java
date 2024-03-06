/* Take values of length and breadth of a rectangle from user and check if it is square or not. */
import java.util.Scanner;
public class CheckS{
    public static void main(String[] args) {
        int length, breadth;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values l and b");
        length= scanner.nextInt();
        breadth= scanner.nextInt();
        scanner.close();
        if(length == breadth){
            System.out.println("its a square");
        }
        else{
            System.out.println("its not a square");
        }
    }
}