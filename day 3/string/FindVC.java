/* 3. Write a program to find the number of vowels, consonents, digits and white space characters in a string */
import java.util.Scanner;

public class FindVC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String s = scanner.nextLine();
        scanner.close();
        int v = 0, c = 0, d = 0, sp = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                sp++;
            } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                v++;
            } else if (ch >= 'a' && ch <= 'z') {
                c++;
            } else if (ch >= '0' && ch <= '9') {
                d++;
            }
        }
        System.out.println("Vowels: " + v + " Consonants: " + c + " Digits: " + d + " White spaces: " + sp);
    }
}

