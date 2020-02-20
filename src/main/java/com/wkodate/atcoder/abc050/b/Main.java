package com.wkodate.atcoder.abc050.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] p = new int[m];
        int[] x = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
            x[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int result = 0;
            for (int j = 0; j < n; j++) {
                if (p[i] == j + 1) {
                    result += x[i];
                    continue;
                }
                result += t[j];
            }
            System.out.println(result);
        }
    }

}
