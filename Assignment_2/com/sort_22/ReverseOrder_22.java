package com.sort_22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseOrder_22 
{

    public static void main(String[] args)
    {
        List<Double> dec = new ArrayList<>();
        dec.add(3.14);
        dec.add(1.618);
        dec.add(2.718);
        dec.add(0.577);
        dec.add(1.414);

        Collections.sort(dec, Collections.reverseOrder());

        System.out.println("Sorted list in reverse order:");
        for (Double num : dec) {
            System.out.println(num);
        }
    }
}

