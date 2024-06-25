package com.string_length_2;

import java.util.HashSet;
import java.util.Scanner;

public class LengthsOfString_2 
{
    public static int length(String str) {
        HashSet<Character> set = new HashSet<>();
        int max_Len = 0;
        int l = 0;

        for (int r = 0; r < str.length(); r++) {
            while (set.contains(str.charAt(r))) {
                set.remove(str.charAt(l));
                l++;
            }
            set.add(str.charAt(r));
            max_Len = Math.max(max_Len, r - l + 1);
        }

        return max_Len;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int res = length(input);
        System.out.println("length is: " + res);
    }
}

