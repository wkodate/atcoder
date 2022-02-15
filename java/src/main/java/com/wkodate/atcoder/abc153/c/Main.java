package com.wkodate.atcoder.abc153.c;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] h = new long[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        Arrays.sort(h);
        long ans = 0;
        for (int i = 0; i < n - k; i++) {
            ans += h[i];
        }
        System.out.println(ans);
    }

}
