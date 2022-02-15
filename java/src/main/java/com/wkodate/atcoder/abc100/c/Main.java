package com.wkodate.atcoder.abc100.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                continue;
            }
            int v = a[i];
            while (v % 2 == 0) {
                v /= 2;
                sum++;
            }
        }
        System.out.println(sum);
    }

}
