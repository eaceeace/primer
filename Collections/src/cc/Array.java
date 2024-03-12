package cc;

public class Array {
    public static void main(String[] args) {
/*
//array initialization
   /* int[] arr= {1,3,5,6,6}; // default value of array will be of zeros not null

    int[] arr= new int[6];*/
        // int[][] arr=new int[3][3];
    /*   int[][] arr = {{1, 2, 3}, {3, 5, 6}, {6, 6, 3}};
        //how to iterate when there is no m and n size
        for (int i = 0; i<arr.length;i++){
        for (int j = 0; j < arr[i].length; j++){
            System.out.println(arr[i][j]);}}  */
        //MATRIX SUM: i*j = i*j rows and coloums should be equal

        //Matrix multiplication : 123 12   condition i*j  x  j*k
        //                        456 35    COLUMN DIM OF FIRST MATRIX = ROW DIM OF SECOND MATRIX
        //                            66
        //-> |
        // Matrix multiplication
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] arr2 = {{1, 2}, {3, 5}, {6, 6}};
        int[][] product = new int[arr1.length][arr2[0].length];

        // Matrix multiplication logic
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr2.length; k++) {
                    product[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        // Print the product matrix
        System.out.println("Product of matrices:");
        printMatrix(product);

        // Matrix addition
        if (arr1.length == arr2.length && arr1[0].length == arr2[0].length) {
            int[][] sum = new int[arr1.length][arr1[0].length];
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[0].length; j++) {
                    sum[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            System.out.println("\nSum of matrices:");
            printMatrix(sum);
        } else {
            System.out.println("Matrix dimensions do not match for addition.");
        }
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}