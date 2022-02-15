package com.wkodate.atcoder.abc151.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n - 1];
        int asum = 0;
        for (int i = 0; i < n - 1; i++) {
            a[i] = sc.nextInt();
            asum += a[i];
        }
        int score = m * n - asum;
        if (score <= k) {
            System.out.println(Math.max(0, score));
            return;
        }
        System.out.println(-1);
    }

}
