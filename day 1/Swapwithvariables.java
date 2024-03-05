/* Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively, write two programs to swap the values of the two variables.
A - first program by using a third variable
B - second program without using any third variable
*/
import java.util.Scanner;
public class Swapwithvariables{
    public static void main(String[] args) {
        int a,b, temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        a= scanner.nextInt();
        b= scanner.nextInt();
        scanner.close(); 
        System.out.println("before swapping : "+a+"\t"+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping : "+a+"\t"+b);
       }
}

