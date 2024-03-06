//Day2 Assignment

/* A three digit number is called Armstrong number if sum of cube of its digit is equal to number itself.
E.g.- 153 is an Armstrong number because (13)+(53)+(33) = 153.
Write all Armstrong numbers between 100 to 500. */ 
 
public class Armstrong{
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 100 and 500:");

        for (int i = 100; i <= 500; i++) {
            int number = i, y = 0,x;
            while (number != 0) {
                 x = number % 10;
                y += (x*x*x);
                number /= 10;
            }
            if (y == i) {
                System.out.println(i);
            }
        }
    }
}

/* A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly. */
import java.util.Scanner;

public class Attendence{
    public static void main(String[] args) {
        int numberClasses, numberAttended, percentage;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of classes held and number of classes attended:");
        numberClasses = scanner.nextInt();
        numberAttended = scanner.nextInt();

        percentage = (int) (((double) numberAttended / numberClasses) * 100);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 75) {
            System.out.println("Student is allowed to write the exam");
        } else {
            System.out.print("Do you have a medical cause? (Y/N): ");
            char medicalCause = scanner.next().charAt(0);

            if (medicalCause == 'Y' || medicalCause == 'y') {
                System.out.println("Student is allowed to write the exam due to a medical cause.");
            } else {
                System.out.println("Student is not allowed to write the exam.");
            }
        }

        scanner.close();
    }
}

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

/* A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade. */

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        System.out.println("Enter 5 subject's marks:");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt(); 
        }
        scanner.close();
        for (int i = 0; i < 5; i++) {
            if (arr[i] > 80) {
                System.out.println(arr[i] + "A");
            } else if (arr[i] >= 60) {
                System.out.println(arr[i] + "B");
            } else if (arr[i] >= 50) {
                System.out.println(arr[i] + "C");
            } else if (arr[i] >= 45) {
                System.out.println(arr[i] + "D");
            } else if (arr[i] >= 25) {
                System.out.println(arr[i] + "E");
            } else {
                System.out.println(arr[i] + "F");
            }
        }
    }
}

/* Write a program to find greatest common divisor (GCD) or highest common factor (HCF) of given two numbers */
import java.util.Scanner;
public class HCF{
    public static void main(String[] args) {
        int num1, num2, hcf = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        scanner.close();
        int min;
        if (num1 > num2) {
            min = num2;
        } else {
            min = num1;
        }
        for (int i = 1; i <= min; ++i) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("The HCF is : " + hcf);
    }
}

/**
 * This program takes 10 integers from the keyboard and prints their average value.
 */
import java.util.Scanner;

public class InputAvg {
    public static void main(String[] args) {
        System.out.println("Enter 10 numbers:");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += arr[i];}
        float avg =  sum / 10;
        System.out.println("Average: " + avg);
    }
}

/* Print the following patterns using loop :
a.
*
**
***
**** */
import java.util.Scanner;
public class Pattern{
    public static void main(String[] args) {
        int row;
        System.out.println("Enter number of rows");
        Scanner scanner = new Scanner(System.in);
        row= scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/* 1010101
    10101 
     101  
      1    */

import java.util.Scanner;

public class PatternB {
    public static void main(String[] args) {
        int row;
        System.out.println("Enter the number of rows:");
        Scanner scanner = new Scanner(System.in);
        row = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
            System.out.print(" ");
            }
            for (int j = 0; j < (row - i) * 2 - 1; j++) {
            System.out.print(j % 2 == 0 ? "1" : "0");
            }
            System.out.println();
        }
        
    }
}

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

/* 3. Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s. */

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int odd = 0, positive = 0, negative = 0, even = 0, zero = 0;
        
        System.out.println("Enter 20 numbers:");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[20];
        
        for (int i = 0; i < 20; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            }
            if (arr[i] % 2 == 0 && arr[i] != 0) {
                even++;
            } else if (arr[i] != 0) {
                odd++;
            } else {
                zero++;
            }
        }
        scanner.close();
        System.out.println("Number of positive numbers: " + positive);
        System.out.println("Number of negative numbers: " + negative);
        System.out.println("Number of odd numbers: " + odd);
        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of zeros: " + zero);
    }
}

/*4. Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order.
  */

import java.util.Scanner;
public class ReverseA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int[] arr2 = new int[10];
         int[] arr1 = new int[10];
         int i,j=0;

        System.out.println("Enter 10 numbers:");
       
        for ( i = 0; i < 10; i++) {
            arr1[i] = scanner.nextInt();
        }
        scanner.close();
        for ( i = 9; i >= 0; i--) {
            arr2[j] = arr1[i];
            j++;
        }
        for ( i = 0; i < 10; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for ( i = 0; i < 10; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
/*7. Find largest and smallest elements of an array. */
import java.util.Scanner;
public class SmallLarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int l = arr[0];
        int s = arr[0];
        for (int i = 1; i < 10; i++) {
            if (arr[i] > l) {
                l = arr[i];
            }
            if (arr[i] < s) {
                s = arr[i];
            }
        } 
        System.out.println(" Largest element :  " + l+"  Smallest element :  " + s);
    }
}


public class Sort {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 45, 15};
        int temp,i,j;
        int n = arr.length;
        for ( i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                     temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("output array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

/*1. Take 10 integer inputs from user and store them in an array and print them on screen.*/
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        System.out.println("Enter 10 numbers");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt(); 
        }
        scanner.close();
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

/*5. Write a program to find the sum and product of all elements of an array */


import java.util.Scanner;
public class Sump{
    public static void main(String[] args) {
        int sum=0;
        double product=1;
        System.out.println("Enter 10 numbers");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt(); 
        }
        for (int i = 0; i < 10; i++) {
            sum += arr[i];
            product *= arr[i];
        }
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);
    }
}

/*  Initialize and print all elements of a 2D array.*/
import java.util.Scanner;

public class TwoD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[5][5];
        System.out.println("Enter 9 numbers:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Elements of the 2D array:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
