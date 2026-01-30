package com.demo;

import java.util.LinkedHashMap;
import java.util.Map;

public class SecondNonReapeatingChar {
    public static void main(String[] args) {

        String s = "programmingm";
        int count = 0;

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else
                map.put(ch, 1);
        }
        System.out.println(map);

        // 2  and above times reapeated characters
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if (m.getValue() >= 2) {
                System.out.println(m.getKey() + "====" + m.getValue());
            }
        }

        for (Map.Entry<Character, Integer> m1 : map.entrySet()) {
            if (m1.getValue() == 2) {
                count++;
            }
            if (count == 2) {
                System.out.println("second reapted char ==>" + m1.getKey());
                break;
            }
        }
    }

}
