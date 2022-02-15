package com.wkodate.atcoder.abc023.c;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[][] rc = new int[n][2];
        for (int i = 0; i < n; i++) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            rc[i][0] = row;
            rc[i][1] = col;
        }

        int ans = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int candyNum = 0;
                for (int l = 0; l < n; l++) {
                    if (rc[l][0] == i + 1 || rc[l][1] == j + 1) {
                        candyNum++;
                    }
                }
                if (candyNum == k) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }

}
