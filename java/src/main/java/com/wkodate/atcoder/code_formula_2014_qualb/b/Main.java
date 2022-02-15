package com.wkodate.atcoder.code_formula_2014_qualb.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < n.length(); i++) {
            int num = n.charAt(n.length() - 1 - i) - '0';
            if (i % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        System.out.println(oddSum + " " + evenSum);
    }

}
