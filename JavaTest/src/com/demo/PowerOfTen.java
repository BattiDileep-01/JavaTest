package com.demo;

import java.util.Scanner;

public class PowerOfTen {

    public static void main(String[] args) {
        System.out.println("enter any number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean power = false;

        int rem = n % 10;
        if (rem != 0) {
            power = false;
        }
        n = n / 10;
        if (n == 1) {
            power = true;
            System.out.println("given number is  a power of ten");
        }

        if (!power) {
            System.out.println("not a power of ten");
        }
    }
}
