package com.wkodate.atcoder.abc052.d;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long[] x = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextLong();
        }
        long sum = 0;
        for (int i = 1; i < n; i++) {
            sum += Math.min(a * (x[i] - x[i - 1]), b);
        }
        System.out.println(sum);
    }

}
