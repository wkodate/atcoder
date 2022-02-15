package com.wkodate.atcoder.abc044.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        // dp[j][k][s]は、x1,...,xj から k 枚選んで xi の合計を s にするような選び方の総数
        // http://arc060.contest.atcoder.jp/data/arc/060/editorial.pdf
        long[][][] dp = new long[n + 1][n + 1][n * a + 1];
        for (int j = 0; j <= n; j++) {
            for (int k = 0; k <= n; k++) {
                for (int s = 0; s <= n * a; s++) {
                    if (j == 0 && k == 0 && s == 0) {
                        dp[j][k][s] = 1;
                        //System.out.println("j=" + j + ", k=" + k + ", s=" + s + ", dp=" + dp[j][k][s]);
                        continue;
                    }
                    if (j >= 1 && s < x[j - 1]) {
                        dp[j][k][s] = dp[j - 1][k][s];
                        //System.out.println("j=" + j + ", k=" + k + ", s=" + s + ", dp=" + dp[j][k][s]);
                        continue;
                    }
                    if (j >= 1 && k >= 1 && s >= x[j - 1]) {
                        dp[j][k][s] = dp[j - 1][k][s] + dp[j - 1][k - 1][s - x[j - 1]];
                        //System.out.println("j=" + j + ", k=" + k + ", s=" + s + ", dp=" + dp[j][k][s]);
                        continue;
                    }
                    dp[j][k][s] = 0;
                    //System.out.println("j=" + j + ", k=" + k + ", s=" + s + ", dp=" + dp[j][k][s]);
                }
            }
        }

        long result = 0;
        // k枚選んだ時の合計がkAになる数を合計する
        for (int i = 1; i <= n; i++) {
            //System.out.println("i=" + i + ", dp[" + n + "][" + i + "][" + (i * a) + "]=" + dp[n][i][i * a]);
            result += dp[n][i][i * a];
        }
        System.out.println(result);
    }

}

