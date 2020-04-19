package com.wkodate.atcoder.abc034.c;

import java.util.Scanner;

public class Main {

    private static long calc(long a, long b, long p) {
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            return calc(a * a % p, b / 2, p);
        }
        return a * calc(a, b - 1, p) % p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final long MOD = 1_000_000_007L;
        int w = sc.nextInt();
        int h = sc.nextInt();
        long a = 1;
        long b = 1;
        for (int i = 1; i < h; i++) {
            a = a * (w - 1 + i) % MOD;
            b = b * i % MOD;
        }
        long ans = a * calc(b, MOD - 2, MOD) % MOD;
        System.out.println(ans);
    }

}
