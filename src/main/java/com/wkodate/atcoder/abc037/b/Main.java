package com.wkodate.atcoder.abc037.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[n];
        int[] l = new int[q];
        int[] r = new int[q];
        int[] t = new int[q];
        for (int i = 0; i < n; i++) {
            a[i] = 0;
        }
        for (int i = 0; i < q; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
            t[i] = sc.nextInt();
        }
        for (int i = 0; i < q; i++) {
            for (int j = l[i]; j <= r[i]; j++) {
                a[j - 1] = t[i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
