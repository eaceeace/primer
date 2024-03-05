

//DAY 1 ASSIGNMENT

/* write a program to calculate the area and perimeter of the recatngle. i/o length and breadth using cmd line argument */

public class Rectangle{
    public static void main(String[] args) {
        int length = Integer.parseInt(args[0]);
        int breadth = Integer.parseInt(args[1]);
        System.out.println("Area of the rectangle: " + (length * breadth);
        System.out.println("Perimeter of the rectangle: " + 2 * (length + breadth));
    }
}

/* Write a program to calculate the perimeter of a triangle. Input the sides of triangle using command Line arguments. */

public class triangle{
    public static void main(String[] args) {
        int side1 = Integer.parseInt(args[0]);
        int side2 = Integer.parseInt(args[1]);
        int side3 = Integer.parseInt(args[2]);
        System.out.println("Perimeter of the triangle: " + (a+b+c));
    }
}

/*Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.*/


public class calc{
    public static void main(String[] args) {
        int number =2345;
        number+=8;
        System.out.println("Number: " + number);
        number/=3;
        System.out.println("Number: " + number);
        number%=5;
        System.out.println("Number: " + number);
        number*=5;
        System.out.println("Number: " + number);
    }
}

/* Input the marks of Robert in three subjects using Scanner (each out of 100 ), write a program to calculate his total marks and percentage marks. */
import java.util.Scanner;
public class marks{
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


        System.out.println("after swapping : "+a+"\t"+b);
       }
}
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



/* The total number of students in a class are 90 out of which 45 are boys. If 50% of the total students secured grade 'A' out of which 20 are boys, then write a program to calculate the total number of girls getting grade 'A'. */

public class Totalgirls{
    public static void main(String[] args) {
        int total= 90, boys=45, girls,x,apercent= 50, pboys= 20, pgirls;
         x= (apercent/100)*total;
         pgirls= pboys-x;
         girls= total-boys;
         System.out.println("Out of total: " + girls + " girls only "+ pgirls+ " secured A grade");
         }
 }


/* Write a program to calculate the sum of the first and the second last digit of a 5 digit. E.g.- NUMBER : 12345        OUTPUT : 1+4=5  Input the number using scanner.*/

import java.util.Scanner;
public class SumOftwoDigits {
    public static void main(String[] args) {
        int number, sum = 0, n,m;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        number = scanner.nextInt();
        scanner.close();
        m= number/ 10000;
        n= ((number/10)%10);
        sum= m+n;
        System.out.println("Output: " + sum);
    }
}

/* Write a program to calculate the sum of the digits of a 3-digit number. Number : 132        Output : 6 Input the number using scanner.*/
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        int number, sum = 0, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        number = scanner.nextInt();
        scanner.close();
        for (int i = number; i != 0; i /= 10) {
            n = i % 10;
            sum+=n;
        }
        System.out.println("Output: " + sum);
    }
}


/* Write a program to reverse a 3-digit number.  E.g.-Number : 132        Output : 231 Input the number using scanner.*/

import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        int number, rev = 0, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        number = scanner.nextInt();
        scanner.close();
        for (int i = number; i != 0; i /= 10) {
            n = i % 10;
            rev = rev * 10 + n;}
        System.out.println("Output: " + rev);
    }
}
