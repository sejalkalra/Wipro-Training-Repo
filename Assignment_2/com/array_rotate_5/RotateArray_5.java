package com.array_rotate_5;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray_5 
{
    
    public static void rotate(int[] num, int k) {
        int n = num.length;
        k = k % n; 
        reverse(num, 0, n - 1);
        reverse(num, 0, k - 1);
        reverse(num, k, n - 1);
    }
    
    private static void reverse(int[] num, int start, int end) {
        while (start < end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter length :");
        int n = sc.nextInt();
        
        int[] num1 = new int[n];
        
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            num1[i] = sc.nextInt();
        }
        
        System.out.println("Enter number of steps to rotate:");
        int k = sc.nextInt();
        
        rotate(num1, k);
        
        System.out.println("After rotation: " + Arrays.toString(num1));
    }
}

