package com.demo;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RevrseString {

    public static void main(String[] args) {

        String s = "my name is  dileep singh";

        String reverseString = Arrays.stream(s.trim().split("\\s+")).map(i -> new StringBuffer(i).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(reverseString);

    }
}
