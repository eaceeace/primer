package cc.array;




import java.util.*;


public class NoDuplicate {
        public static void main(String[] args) {
            Set<Integer> set = new HashSet<>();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of rows: ");
            int m = scanner.nextInt();
            System.out.print("Enter the number of columns: ");
            int n = scanner.nextInt();
            int[][] arr = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("Enter value for [%d][%d]: ", i, j);
                    int a = scanner.nextInt();
                    while (!set.add(a)) {
                        System.out.println("Input is a duplicate. Please enter another number.");
                        a = scanner.nextInt();
                    }
                    arr[i][j] = a;
                }
            }
            System.out.println("2D array:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            scanner.close();
        }
    }


