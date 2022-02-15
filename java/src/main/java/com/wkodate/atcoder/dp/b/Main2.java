package com.wkodate.atcoder.dp.b;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            for (int j = Math.max(i - k, 0); j <= i - 1; j++) {
                dp[i] = Math.min(dp[i], dp[j] + Math.abs(h[i] - h[j]));
            }
        }
        System.out.println(dp[n - 1]);
    }

}
