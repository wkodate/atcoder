package com.wkodate.atcoder.arc007.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] d = new int[m];
        for (int i = 0; i < m; i++) {
            d[i] = sc.nextInt();
        }
        int[] cd = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            cd[i] = i;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 1; j <= n; j++) {
                if (cd[j] == d[i]) {
                    int tmp = cd[j];
                    cd[j] = cd[0];
                    cd[0] = tmp;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(cd[i]);
        }
    }

}
