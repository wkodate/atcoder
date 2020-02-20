package com.wkodate.atcoder.abc086.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (isOddMultipliedBy(a, b)) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }

    private static boolean isOddMultipliedBy(int a, int b) {
        return a % 2 == 1 && b % 2 == 1;
    }
}
