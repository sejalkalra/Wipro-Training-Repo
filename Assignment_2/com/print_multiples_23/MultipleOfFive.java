package com.print_multiples_23;

import java.util.ArrayList;
import java.util.List;

public class MultipleOfFive 
{
    public static void main(String[] args) 
    {
        List<Integer> n = new ArrayList<>();
        n.add(90);
        n.add(7);
        n.add(125);
        n.add(30);
        n.add(42);
        n.add(20);
        
        System.out.println("multiples of 5");
        for (int num : n) {
            if (num % 5 == 0) {
                System.out.println(num);
            }
        }
    }
}

