package com.pack;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static int MaximumProduct(int N, String S) {
        // Step 1: Calculate frequency of each character
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : S.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        
        // Step 2: Calculate maximum prefix and suffix lengths for each character
        int maxProduct = 0;
        for (char c : freq.keySet()) {
            int count = freq.get(c);
            int prefixLength = 0;
            int suffixLength = 0;
            
            // Calculate longest prefix of the character
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == c) {
                    prefixLength++;
                } else {
                    break;
                }
            }
            
            // Calculate longest suffix of the character
            for (int i = S.length() - 1; i >= 0; i--) {
                if (S.charAt(i) == c) {
                    suffixLength++;
                } else {
                    break;
                }
            }
            
            // Update maxProduct with current character's product
            maxProduct = Math.max(maxProduct, prefixLength * suffixLength);
        }
        
        return maxProduct;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String S = scanner.nextLine();
        System.out.println(MaximumProduct(N, S));
    }
}