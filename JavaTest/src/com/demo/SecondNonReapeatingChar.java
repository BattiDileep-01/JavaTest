package com.demo;

import java.util.LinkedHashMap;
import java.util.Map;

public class SecondNonReapeatingChar {
    public static void main(String[] args) {

        String s = "programming";

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else
                map.put(ch, 1);
        }
        System.out.println(map);
    }

}
