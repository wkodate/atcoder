package com.wkodate.atcoder.abc102.c;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            b[i] = a[i] - (i + 1);
        }
        Arrays.sort(b);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.abs(a[i] - (b[b.length / 2] + (i + 1)));
        }
        System.out.println(ans);
    }
}
