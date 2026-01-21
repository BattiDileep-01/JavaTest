package com.demo;

import com.sun.source.tree.ArrayAccessTree;

import java.util.Arrays;

public class BigElementInArray {

    public static void main(String[] args) {

        int[] arr = {12, 974, 787, 7987986, 765};

        int bigElement = Arrays.stream(arr).max().getAsInt();
        int minElement = Arrays.stream(arr).min().getAsInt();

        System.out.println(bigElement);
        System.out.println(minElement);
    }
}
