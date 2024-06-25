package com.string_reverse_1;

import java.util.Scanner;

public class ReverseString_1 
{

    public static String reverseStr(String input) {
        if (input == null) {
            return input;
        }

        char[] ch = input.toCharArray();
        int l = 0;
        int r = ch.length - 1;

        while (l < r) {
            char temp = ch[l];
            ch[l] = ch[r];
            ch[r] = temp;

            l++;
            r--;
        }

        return new String(ch);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();

        String rev = reverseStr(input);

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + rev);
    }
}

