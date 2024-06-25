package com.array_missing_6;

import java.util.*;

public class MissingArray_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements ");
        int n = sc.nextInt();
        
        int[] num = new int[n];
        
        System.out.println("Enter elements of array ");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        
        int mised_Number = MissingNumber(num);
        
        System.out.println("missing number in array is " + mised_Number);
        
    }
    
    public static int MissingNumber(int[] num1) {
        int n = num1.length;
        int desiredSum = n * (n + 1) / 2;
        
        int actualSum = 0;
        for (int num : num1) {
            actualSum += num;
        }
        
        return desiredSum - actualSum;
    }
}
