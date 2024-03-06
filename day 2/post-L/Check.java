/*Take 10 integer inputs from user and store them in an array. Again ask user to give a number. Now, tell user whether that number is present in array or not.
*/
import java.util.Scanner;
public class Check {
    public static void main(String[] args) {
        int a,b=0;
        System.out.println("Enter 10 numbers");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt(); 
        }

        System.out.println("Enter new number");
        a=scanner.nextInt(); 
        scanner.close();
        for (int i = 0; i < 10; i++) {
            if (a==arr[i]){
              b=1;
            }
            
    }
    if(b==1){
              System.out.println("Number already present enter new number");
            }
    else{
              System.out.println("Number is not present in the array");
            }
            
    }
}



    

