/* write a program to calculate the area and perimeter of the recatngle. i/o length and breadth using cmd line argument */

public class Rectangle{
    public static void main(String[] args) {
        int length = Integer.parseInt(args[0]);
        int breadth = Integer.parseInt(args[1]);
        System.out.println("Area of the rectangle: " + (length * breadth);
        System.out.println("Perimeter of the rectangle: " + 2 * (length + breadth));
    }
}