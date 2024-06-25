package com.digit_25;

import java.util.Scanner;

public class Sum_Of_Digit 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        
        int sum = Digits(num);
        System.out.println("Sum of digits " + num + " is: " + sum);
    }

    public static int Digits(int num1) 
    {
        int sum = 0;
        num1 = Math.abs(num1);
        
        while (num1 > 0) {
            sum += num1 % 10;
            num1 /= 10;
        }
        return sum;
    }
}


