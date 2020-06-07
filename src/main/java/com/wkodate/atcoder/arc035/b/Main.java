package com.wkodate.atcoder.arc035.b;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        final long MOD = 1_000_000_007;
        long ans = 1;
        for (long i = 2; i <= n; i++) {
            ans *= i;
            ans %= MOD;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        long MOD = 1_000_000_007;
        long ans1 = 0;
        long ans2 = 1;
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        Arrays.sort(t);
        int cnt = 1;
        for (int i = 0; i < n - 1; i++) {
            ans1 += t[i] * (n - i);
            if (t[i] != t[i + 1]) {
                ans2 *= factorial(cnt);
                ans2 %= MOD;
                cnt = 1;
                continue;
            }
            cnt++;
        }
        ans1 += t[n - 1];
        ans2 *= factorial(cnt);
        ans2 %= MOD;
        System.out.println(ans1);
        System.out.println(ans2);
    }

}
