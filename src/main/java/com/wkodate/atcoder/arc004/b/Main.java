package com.wkodate.atcoder.arc004.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n];
        int maxLen = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
            sum += d[i];
            maxLen = Math.max(maxLen, d[i]);
        }
        System.out.println(sum);
        System.out.println(Math.max(2 * maxLen - sum, 0));
    }

}
