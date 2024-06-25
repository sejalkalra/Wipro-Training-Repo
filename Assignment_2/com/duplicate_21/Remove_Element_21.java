package com.duplicate_21;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_Element_21 {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 7, 8, 7, 9);

        List<Integer> distNum = num.stream()
                                              .distinct()
                                              .collect(Collectors.toList());

        System.out.println("Original list: " + num);
        System.out.println("List without duplicates: " + distNum);
    }
}




