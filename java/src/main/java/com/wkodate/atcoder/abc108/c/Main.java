package com.wkodate.atcoder.abc108.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] num = new long[k];
        for (int i = 1; i <= n; i++) {
            num[i % k]++;
        }
        long ans = 0;
        for (int a = 0; a < k; a++) {
            int b = (k - a) % k;
            int c = (k - a) % k;
            if ((b + c) % k != 0) {
                continue;
            }
            ans += num[a] * num[b] * num[c];
        }
        System.out.println(ans);
    }

}
