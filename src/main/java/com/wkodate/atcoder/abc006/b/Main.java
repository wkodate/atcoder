package com.wkodate.atcoder.abc006.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0 || n == 1) {
            System.out.println(0);
            return;
        }
        long[] a = new long[n];
        for (int i = 2; i < n; i++) {
            if (i == 2) {
                a[i] = 1;
                continue;
            }
            a[i] = (a[i - 1] + a[i - 2] + a[i - 3]) % 10007;
        }
        System.out.println(a[n - 1]);
    }

}
