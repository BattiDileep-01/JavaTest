package com.demo;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        String s = "programming";
        int count = 0;

        Map<Character, Long> frequency = Arrays.stream(s.chars().toArray()).mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        System.out.println(frequency);

        for (Map.Entry<Character, Long> m : frequency.entrySet()) {

            if (m.getValue() == 1) {
                count++;
                if (count ==4) {
                    System.out.println(m.getKey());
                }
            }

        }
    }

}
