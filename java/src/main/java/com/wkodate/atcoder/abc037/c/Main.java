package com.wkodate.atcoder.abc037.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long[] sum = new long[n - k + 1];
        for (int i = 0; i < k; i++) {
            sum[0] += a[i];
        }
        for (int i = 1; i < sum.length; i++) {
            sum[i] = sum[i - 1] + a[i + k - 1] - a[i - 1];
        }
        long ans = 0;
        for (int i = 0; i < sum.length; i++) {
            ans += sum[i];
        }
        System.out.println(ans);
    }

}
