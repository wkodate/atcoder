package com.wkodate.atcoder.abc032.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] s = new long[n];
        boolean hasZero = false;
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextLong();
            if (s[i] == 0) {
                hasZero = true;
            }
        }
        if (hasZero) {
            System.out.println(n);
            return;
        }
        long ans = 0;
        int right = 0;
        long mul = 1;
        for (int left = 0; left < n; left++) {
            while (right < n && mul * s[right] <= k) {
                mul *= s[right++];
            }
            ans = Math.max(right - left, ans);
            if (right == left) {
                right++;
            } else {
                mul /= s[left];
            }
        }
        System.out.println(ans);
    }

}
