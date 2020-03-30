package com.wkodate.atcoder.abc010.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int txa = sc.nextInt();
        int tya = sc.nextInt();
        int txb = sc.nextInt();
        int tyb = sc.nextInt();
        int t = sc.nextInt();
        int v = sc.nextInt();
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            double d = Math.sqrt(Math.pow(x[i] - txa, 2) + Math.pow(y[i] - tya, 2))
                    + Math.sqrt(Math.pow(x[i] - txb, 2) + Math.pow(y[i] - tyb, 2));
            if (d <= t * v) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }

}
