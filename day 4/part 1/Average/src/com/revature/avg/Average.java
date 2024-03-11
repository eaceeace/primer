
package com.revature.avg;

public class Average {
    public int ag(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        int y = (sum / arr.length);
        return y;
    }
}
