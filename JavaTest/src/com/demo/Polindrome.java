package com.demo;

import java.util.Scanner;

public class Polindrome {


    public static void main(String[] args) {

        System.out.println("enter any name");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        String rs = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            rs = ch + rs;
        }
        System.out.println(s + "==" + rs);

        if (s.equals(rs)) {
            System.out.println("polindrome");
        } else
            System.out.println("not a polindrome");

        //Approach -2


    }
}
