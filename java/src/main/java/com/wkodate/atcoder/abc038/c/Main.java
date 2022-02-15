package com.wkodate.atcoder.abc038.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        long lr = 0;
        long ans = n;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] < a[i + 1]) {
                lr++;
                continue;
            }
            if (lr > 0) {
                ans += lr * (lr + 1) / 2;
            }
            lr = 0;
        }
        ans += lr * (lr + 1) / 2;
        System.out.println(ans);
    }

}
