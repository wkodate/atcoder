package com.wkodate.atcoder.code_festival_2015_quala.c;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long t = sc.nextLong();
        int[] a = new int[n];
        int[] b = new int[n];
        long sum = 0;
        long[] diff = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            sum += a[i];
            diff[i] = a[i] - b[i];
        }
        Arrays.sort(diff);
        int cnt = 0;
        while (sum > t && cnt < n) {
            sum -= diff[n - 1 - cnt];
            cnt++;
        }
        if (sum <= t) {
            System.out.println(cnt);
        } else {
            System.out.println(-1);
        }
    }

}
