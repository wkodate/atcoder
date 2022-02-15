package com.wkodate.atcoder.abc014.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        String[] bin = Integer.toBinaryString(x).split("");
        int sum = 0;
        for (int i = bin.length - 1; i >= 0; i--) {
            if ("1".equals(bin[i])) {
                sum += a[bin.length - i - 1];
            }
        }
        System.out.println(sum);
    }

}
