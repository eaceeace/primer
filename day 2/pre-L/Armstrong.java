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
