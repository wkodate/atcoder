package com.wkodate.atcoder.abc015.d;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n + 1];
        int[] b = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int[][][] dp = new int[w + 1][k + 1][n + 1];
        for (int i = 1; i <= w; i++) {
            for (int j = 1; j <= k; j++) {
                for (int l = 1; l <= n; l++) {
                    if (a[l] <= i) {
                        dp[i][j][l] = Math.max(dp[i][j][l - 1], dp[i - a[l]][j - 1][l - 1] + b[l]);
                    } else {
                        dp[i][j][l] = dp[i][j][l - 1];
                    }
                }
            }
        }
        System.out.println(dp[w][k][n]);
    }

}
