package com.wkodate.atcoder.abc023.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[][] rc = new int[n][2];
        int[] rowCounts = new int[r];
        int[] colCounts = new int[c];
        for (int i = 0; i < n; i++) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            rc[i][0] = row;
            rc[i][1] = col;
            rowCounts[rc[i][0] - 1]++;
            colCounts[rc[i][1] - 1]++;
        }
        int[] rowCandies = new int[100001];
        int[] colCandies = new int[100001];
        for (int i = 0; i < r; i++) {
            rowCandies[rowCounts[i]]++;
        }
        for (int i = 0; i < c; i++) {
            colCandies[colCounts[i]]++;
        }
        long ans = 0;
        // 変形した問題で、和がk個となるマス数を求める
        for (int i = 0; i <= k; i++) {
            ans += (long) rowCandies[i] * colCandies[k - i];
        }
        for (int i = 0; i < n; i++) {
            // 起点にアメがあり、和がk個となるマス数だけ引く
            if (rowCounts[rc[i][0] - 1] + colCounts[rc[i][1] - 1] == k) {
                ans--;
            }
            // 起点にアメがあり、和がk+1個となるマス数だけ足す
            if (rowCounts[rc[i][0] - 1] + colCounts[rc[i][1] - 1] == k + 1) {
                ans++;
            }
        }
        System.out.println(ans);
    }

}
