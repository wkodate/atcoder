package com.wkodate.atcoder.abc090.d;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        if (k == 0) {
            System.out.println(n * n);
            return;
        }
        long ans = 0;
        for (long i = k + 1; i <= n; i++) {
            ans += (i - k) * (n / i);
            ans += Math.max(0, n % i - k + 1);
        }
        System.out.println(ans);
    }

}
