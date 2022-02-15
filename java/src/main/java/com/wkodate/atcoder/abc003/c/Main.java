package com.wkodate.atcoder.abc003.c;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = sc.nextInt();
        }
        Arrays.sort(r);
        double ans = 0;
        for (int i = n - k; i < n; i++) {
            ans = (ans + r[i]) / 2;
        }
        System.out.println(ans);
    }

}
