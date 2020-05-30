package com.wkodate.atcoder.arc034.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int[] d = new int[n];
        int[] e = new int[n];
        double ans = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
            e[i] = sc.nextInt();
            ans = Math.max(ans, a[i] + b[i] + c[i] + d[i] + (double) e[i] * 110 / 900);
        }
        System.out.println(ans);
    }

}
