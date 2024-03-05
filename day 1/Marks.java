/* Input the marks of Robert in three subjects using Scanner (each out of 100 ), write a program to calculate his total marks and percentage marks. */
import java.util.Scanner;
public class Marks{
    public static void main(String[] args) {
        int mark1, mark2, mark3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks");
        mark1= scanner.nextInt();
        mark2= scanner.nextInt();
        mark3= scanner.nextInt();
        scanner.close();

        if ( mark1 <=100 && mark2 <= 100 && mark3 <=100){
         System.out.println("subject 1 :"+ mark1 + "subject 2 :"+ mark2 +"subject 3 :"+ mark3);
         System.out.println("Total :"+ (mark1 + mark2 + mark3));
         System.out.println("percentage :"+ (mark1 + mark2 + mark3)/3);

        }else {
            System.out.println("Invalid input");
        }

    }
}