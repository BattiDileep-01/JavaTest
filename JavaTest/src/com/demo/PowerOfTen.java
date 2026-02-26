package com.demo;

import java.io.PrintStream;
import java.util.Scanner;

public class PowerOfTen {

    public static void main(String[] args) {
        System.out.println("enter any number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean power = false;

        while (n > 0) {
            int rem = n % 10;

            if (n != 0) {
                power = false;
            }
            n = n / 10;
            if (n == 1) {
                power = true;
                System.out.println("given number is power of ten");
                break;
            }
        }
        if (!power) {
            System.out.println("given number is not apower of ten");
        }
    }
}
