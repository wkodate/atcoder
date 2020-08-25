package com.wkodate.atcoder.abc035.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] ans = new int[n + 2];
        int[][] lr = new int[q][2];
        for (int i = 0; i < q; i++) {
            lr[i][0] = sc.nextInt();
            lr[i][1] = sc.nextInt();
        }
        for (int i = 0; i < q; i++) {
            ans[lr[i][0]]++;
            ans[lr[i][1] + 1]--;
        }
        for (int i = 1; i <= n; i++) {
            ans[i] += ans[i - 1];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (ans[i] % 2 == 0) {
                sb.append(0);
            } else {
                sb.append(1);
            }
        }
        System.out.println(sb);
    }

}
