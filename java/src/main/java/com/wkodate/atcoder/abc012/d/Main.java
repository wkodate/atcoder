package com.wkodate.atcoder.abc012.d;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[][] warshallFloyd(int[][] d) {
        for (int k = 0; k < d.length; k++) {
            for (int i = 0; i < d.length; i++) {
                for (int j = 0; j < d.length; j++) {
                    d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
                }
            }
        }
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        int[] t = new int[m];
        int[][] d = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(d[i], 1_000_000);
            d[i][i] = 0;
        }
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
            t[i] = sc.nextInt();
            d[a[i]][b[i]] = t[i];
            d[b[i]][a[i]] = t[i];
        }
        int[][] dis = warshallFloyd(d);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int maxD = 0;
            for (int j = 0; j < n; j++) {
                maxD = Math.max(maxD, dis[i][j]);
            }
            ans = Math.min(ans, maxD);
        }
        System.out.println(ans);
    }

}
