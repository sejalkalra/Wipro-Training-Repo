package com.array_29;

import java.util.Scanner;

public class Sum_Average 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        double avrg = (double) sum / n;

        System.out.println("Sum of all elements: " + sum);
        System.out.println("Average of all elements: " + avrg);

    }
}

