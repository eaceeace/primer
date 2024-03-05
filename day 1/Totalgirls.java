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
