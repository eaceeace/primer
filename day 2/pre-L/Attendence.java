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