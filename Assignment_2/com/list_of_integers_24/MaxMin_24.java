package com.list_of_integers_24;

import java.util.ArrayList;
import java.util.List;

public class MaxMin_24
{
    public static void main(String[] args) 
    {
        List<Integer> n = new ArrayList<>();
        n.add(10);
        n.add(5);
        n.add(7);
        n.add(3);
        n.add(15);
        
        int min = n.get(0);
        int max = n.get(0);
        
        for (int i = 1; i < n.size(); i++) {
            int currentNum = n.get(i);
            if (currentNum < min) {
                min = currentNum; 
            }
            if (currentNum > max) {
                max = currentNum; 
            }
        }
        
        System.out.println("List of numbers: " + n);
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}

