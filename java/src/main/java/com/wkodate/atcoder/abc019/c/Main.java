package com.wkodate.atcoder.abc019.c;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        HashSet<Long> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            while (a[i] % 2 == 0) {
                a[i] /= 2;
            }
            set.add(a[i]);
        }
        System.out.println(set.size());
    }

}
