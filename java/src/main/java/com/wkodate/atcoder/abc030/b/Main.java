package com.wkodate.atcoder.abc030.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        double radn = ((double) n % 12) / 12 * 360 + (double) m / 60 * 30;
        double radm = ((double) m / 60 * 360);
        System.out.println(Math.min(Math.abs(radn - radm), 360 - Math.abs(radn - radm)));
    }

}
