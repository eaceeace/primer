
public class Sort {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 45, 15};
        int temp,i,j;
        int n = arr.length;
        for ( i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                     temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("output array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

    
