package com.string_reverse_word_30;

import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWord 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string ");
        String inputStr = sc.nextLine();

        String reverseStr = Arrays.stream(inputStr.split("\\s+"))
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));

        System.out.println("Original string: " + inputStr);
        System.out.println("Reversed string: " + reverseStr);

    }
}

