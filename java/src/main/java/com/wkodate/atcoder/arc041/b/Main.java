package com.wkodate.atcoder.arc041.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] b = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] row = sc.next().split("");
            for (int j = 0; j < m; j++) {
                b[i][j] = Integer.parseInt(row[j]);
            }
        }
        int[][] a = new int[n][m];
        int[][] dxdy = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                int min = 9;
                for (int k = 0; k < dxdy.length; k++) {
                    int r = i + dxdy[k][0];
                    int c = j + dxdy[k][1];
                    min = Math.min(min, b[r][c]);
                    if (min == 0) {
                        break;
                    }
                }
                if (min == 0) {
                    continue;
                }
                a[i][j] += min;
                for (int k = 0; k < dxdy.length; k++) {
                    int r = i + dxdy[k][0];
                    int c = j + dxdy[k][1];
                    b[r][c] -= min;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < m; j++) {
                sb.append(a[i][j]);
            }
            System.out.println(sb);
        }
    }

}
