/* 2. Write a program that takes your full name as input and displays the abbreviations of the first and middle names except the last name which is displayed as it is. For example, if your name is Robert Brett Roser, then the output should be R.B.Roser. */

import java.util.Scanner;

public class NameInitials {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String name = scanner.nextLine();
        scanner.close();
        String[] s = name.split(" ");
        StringBuilder sn = new StringBuilder();
        for (int i = 0; i < s.length - 1; i++) {
            sn.append(s[i].charAt(0)).append(".");
        }
         sn.append(s[s.length - 1]);
        System.out.println("name : " +sn);
    }
}
        


    

