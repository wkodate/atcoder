package com.wkodate.atcoder.abc051.d;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        long[] f = new long[k + 2];
        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i <= k + 1; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        System.out.println(f[k] + " " + f[k + 1]);
    }

}
