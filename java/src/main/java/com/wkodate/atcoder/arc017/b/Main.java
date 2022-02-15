package com.wkodate.atcoder.arc017.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean increasing = false;
        int ans = 0;
        for (int i = 0; i < n - k + 1; i++) {
            if (increasing) {
                if (a[i + k - 2] < a[i + k - 1]) {
                    ans++;
                } else {
                    i += k - 2;
                    increasing = false;
                }
            } else {
                increasing = true;
                for (int j = 0; j < k - 1; j++) {
                    if (a[i + j] >= a[i + j + 1]) {
                        increasing = false;
                        break;
                    }
                }
                if (increasing) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }

}
