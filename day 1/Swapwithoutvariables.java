import java.util.Scanner;
public class Swapwithoutvariables{
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        a= scanner.nextInt();
        b= scanner.nextInt();
        scanner.close(); 
        System.out.println("before swapping : "+a+"\t"+b);
        if(b>a){
         b+= a; 
         a = b- a; 
         b-= a;
        }
        else{
        a+= b; 
        b = a - b; 
        a-= b; }
        System.out.println("After swapping: " + a + "\t" + b);
    }
}

