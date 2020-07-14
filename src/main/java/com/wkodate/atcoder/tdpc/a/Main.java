package com.wkodate.atcoder.tdpc.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
            sum += p[i];
        }
        boolean[][] dp = new boolean[n + 1][sum + 1];
        dp[0][0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j >= p[i - 1]) {
                    dp[i][j] = dp[i - 1][j] | dp[i - 1][j - p[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        int ans = 0;
        for (int i = 0; i <= sum; i++) {
            if (dp[n][i]) {
                ans++;
            }
        }
        System.out.println(ans);
    }

}
