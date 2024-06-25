package com.integer_array_26;

import java.util.Scanner;

public class SecondLargeNum
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements separated by space: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int secondLargest = SecondLargest(arr);

        System.out.println("Second largest element in the array is " + secondLargest);

    }

    public static int SecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements");
            return -1; 
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
            return -1; 
        }

        return secondLargest;
    }
}

