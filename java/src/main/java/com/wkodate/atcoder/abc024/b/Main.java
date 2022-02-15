package com.wkodate.atcoder.abc024.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            int diff = a[i + 1] - a[i];
            if (diff <= t) {
                sum += diff;
                continue;
            }
            sum += t;
        }
        System.out.println(sum + t);
    }

}
