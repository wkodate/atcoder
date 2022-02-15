package com.wkodate.atcoder.abc015.c;

import java.util.Scanner;

public class Main {

    private static int n;
    private static int k;
    private static int[][] t;

    private static boolean dfs(int xor, int i) {
        if (i == n) {
            return xor == 0;
        }
        boolean found = false;
        for (int l = 0; l < k; l++) {
            if (dfs(xor ^ t[i][l], i + 1)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        t = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                t[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < k; i++) {
            if (dfs(t[0][i], 1)) {
                System.out.println("Found");
                return;
            }
        }
        System.out.println("Nothing");
    }

}
