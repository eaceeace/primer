/* 6. Write down the names of 10 of your friends in an array and then sort those in alphabetically ascending order.(HINT : USE the compareTo methid of String) */
public class Compare{
    public static void main(String[] args) {
        String temp;
        String[] n = {"Vijay", "Cam", "Vithun", "Sumanth", "Cvm", "Nick", "Lex", "Irfan", "Adhi", "Naresh"};
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i].compareTo(friends[j]) > 0) {
                     temp = n[i];
                     n[i]= n[j];
                     n[j] = temp;
                }
            }
        }
        System.out.println("Sorted names:");
        for (String i: n) {
            System.out.println(n);
        }
    }
}