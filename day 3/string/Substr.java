/*  Input a string which contains some palindrome substrings. Find out the position of palindrome substrings if exist and replace it by *. (For example if input string is “bob has a radar plane” then it should convert in “*** has a ***** plane”.*/

import java.util.Scanner;

public class Substr {
    public static boolean check(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String s = scanner.nextLine();
        scanner.close();

        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();

        for (String i : words) {
            if (check(i)) {
                res.append("*".repeat(i.length())).append(" ");
            } else {
                res.append(i).append(" ");
            }
        }

        System.out.println("Result: " + res.toString().trim());
    }
}

