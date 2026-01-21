package com.demo;

import java.util.Arrays;

public class CombineArrays {

    public static void combineArray(int[] arr1, int[] arr2, int[] arr3) {

        int a = 0, b = 0, c = 0;

        int n1 = arr1.length;
        int n2 = arr2.length;

        while (n1 > a) {
            arr3[c++] = arr1[a++];
        }
        while (n2 > b) {
            arr3[c++] = arr2[b++];
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {6, 5, 4};

        int[] arr3 = new int[arr1.length + arr2.length];
        combineArray(arr1, arr2, arr3);
    }
}
