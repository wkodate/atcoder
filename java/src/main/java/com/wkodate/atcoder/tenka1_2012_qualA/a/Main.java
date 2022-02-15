package com.wkodate.atcoder.tenka1_2012_qualA.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println(1);
            return;
        }
        long[] a = new long[n + 1];
        long[] b = new long[n + 1];
        b[1] = 1;
        for (int i = 2; i <= n; i++) {
            a[i] = a[i - 1] + b[i - 1];
            b[i] = a[i - 1];
        }
        System.out.println(2 * a[n] + b[n]);
    }

}
