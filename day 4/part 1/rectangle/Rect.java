package rectangle;
import java.util.Scanner;

public class Rect{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Area rectangle = new Area();
        System.out.print("Enter the length and breadth of the rectangle: ");
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();
        scanner.close();
        rectangle.setDim(length, breadth);
        System.out.println("Area : " + rectangle.getArea());
    }
}
