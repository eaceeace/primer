/*4. Write a program to check if a given string is a Palindrome.
A palindrome reads same from front and back e.g.- aba, ccaacc, mom, etc. */

import java.util.Scanner;

public class Palindrome {
    public static int check(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end){
            if (s.charAt(start)!= s.charAt(end)) {
                return 0; 
            }
            start++;
            end--;  }
        return 1;  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String s = scanner.nextLine();
        scanner.close();
        if (check(s) == 1) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not palindrome.");
        }
    }
}