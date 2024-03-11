package com.revature.avg;

import com.revature.avg.Average;

import java.util.Scanner;

//Find avg of 3 numbers using oops
1public class vo{
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner s = new Scanner(System.in);
        Average avg = new Average();
        for (int i = 0; i < 3; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        System.out.println("avg : " + avg.ag(arr)); // Corrected output formatting
    }
}