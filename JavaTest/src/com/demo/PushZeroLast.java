package com.demo;

import java.util.Arrays;

public class PushZeroLast {

    public static void main(String[] args) {

        int[] arr = {1,2,3,0,9,0,8,0};
        int start =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] !=0){
                int temp = arr[i];
                arr[i] = arr[start];
                arr[start] = temp;
                start++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
