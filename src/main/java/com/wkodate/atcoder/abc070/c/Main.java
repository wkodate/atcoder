package com.wkodate.atcoder.abc070.c;

import java.util.Scanner;

public class Main {

    // 最大公約数
    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // 最小公倍数
    private static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] t = new long[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextLong();
        }

        // 最小公倍数を直接計算することはできないので最大公約数から求める
        long result = 1L;
        for (int i = 0; i < n; i++) {
            result = lcm(result, t[i]);
        }
        System.out.println(result);
    }

}
