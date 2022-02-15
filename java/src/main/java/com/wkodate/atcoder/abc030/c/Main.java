package com.wkodate.atcoder.abc030.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long x = sc.nextLong();
        long y = sc.nextLong();
        long[] a = new long[n];
        long[] b = new long[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextLong();
        }
        int i = 0;
        int j = 0;
        int ans = 0;
        long current = a[0];
        while (i < n && j < m) {
            while (i < n && a[i] < current) {
                i++;
            }
            if (i >= n) {
                break;
            }
            current = a[i] + x;
            while (j < m && b[j] < current) {
                j++;
            }
            if (j >= m || b[j] < current) {
                break;
            }
            current = b[j] + y;
            ans++;
        }
        System.out.println(ans);
    }

}
