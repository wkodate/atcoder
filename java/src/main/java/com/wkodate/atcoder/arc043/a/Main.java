package com.wkodate.atcoder.arc043.a;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long[] s = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextLong();
            sum += s[i];
        }
        Arrays.sort(s);
        if (s[0] == s[n - 1]) {
            System.out.println(-1);
            return;
        }
        double p = (double) b / (s[n - 1] - s[0]);
        double q = a - p / n * sum;
        System.out.println(p + " " + q);
    }

}
