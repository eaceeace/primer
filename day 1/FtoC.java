/* Write a program to convert Fahrenheit into Celsius. Input the value using scanner.*/

import java.util.Scanner;
public class FtoC{
    public static void main(String[] args) {
        float farenheit, celsius;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the farenheit");
        farenheit= scanner.nextInt();
        scanner.close();
        celsius= (((farenheit-32)*(5))/9);
        System.out.println("celsius :"+ celsius) ;
        }
}
