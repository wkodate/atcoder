package com.wkodate.atcoder.arc020.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int cnt = 0;
                if (i == j) {
                    continue;
                }
                for (int k = 0; k < n; k++) {
                    if (k % 2 == 0) {
                        if (a[k] != i) {
                            cnt++;
                        }
                    } else {
                        if (a[k] != j) {
                            cnt++;
                        }
                    }
                }
                min = Math.min(min, cnt);
            }
        }
        System.out.println(min * c);
    }

}
