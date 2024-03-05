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