package com.wkodate.atcoder.abc041.c;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] a = new long[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = i + 1;
            a[i][1] = sc.nextLong();

        }
        Arrays.sort(a, Comparator.comparingLong((long[] arr) -> arr[1]).reversed());
        for (int i = 0; i < n; i++) {
            System.out.println(a[i][0]);
        }
    }

}
