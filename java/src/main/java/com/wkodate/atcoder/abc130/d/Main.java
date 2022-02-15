package com.wkodate.atcoder.abc130.d;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long ans = 0;
        int r = 0;
        long sum = 0;
        for (int l = 0; l < n; l++) {
            while (r < n && sum < k) {
                sum += a[r++];
            }
            if (sum < k) {
                break;
            }
            ans += n - r + 1;
            if (l == r) {
                r++;
            } else {
                sum -= a[l];
            }
        }
        System.out.println(ans);
    }

}
