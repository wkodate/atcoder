package com.wkodate.atcoder.abc031.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int tmaxSum = Integer.MIN_VALUE;
        for (int ti = 0; ti < n; ti++) {
            int amaxIdx = 0;
            int amaxSum = Integer.MIN_VALUE;
            for (int ai = 0; ai < n; ai++) {
                if (ai == ti) {
                    continue;
                }
                int start = Math.min(ti, ai);
                int end = Math.max(ti, ai);
                int asum = 0;
                for (int i = start; i <= end; i++) {
                    if ((i - start) % 2 != 0) {
                        asum += a[i];
                    }
                }
                if (asum > amaxSum) {
                    amaxIdx = ai;
                    amaxSum = asum;
                }
            }
            int start = Math.min(ti, amaxIdx);
            int end = Math.max(ti, amaxIdx);
            int tsum = 0;
            for (int i = start; i <= end; i++) {
                if ((i - start) % 2 == 0) {
                    tsum += a[i];
                }
            }
            tmaxSum = Math.max(tmaxSum, tsum);
        }
        System.out.println(tmaxSum);
    }

}
