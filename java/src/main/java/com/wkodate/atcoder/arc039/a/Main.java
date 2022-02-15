package com.wkodate.atcoder.arc039.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a / 100 - b / 100 < 8) {
            System.out.println(a - b + Math.max(9 - (a / 100), (b / 100) - 1) * 100);
            return;
        }
        if ((a % 100) / 10 - (b % 100) / 10 < 8) {
            System.out.println(a - b + Math.max(9 - (a % 100) / 10, (b % 100) / 10) * 10);
            return;
        }
        if (a % 10 - b % 10 < 8) {
            System.out.println(a - b + Math.max(9 - a % 10, b % 10));
            return;
        }
        System.out.println(a - b);
    }

}
