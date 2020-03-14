package com.wkodate.atcoder.abc140.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            b[i] = sc.nextInt();
        }

        int sum = b[0] + b[n - 2];
        for (int i = 0; i < n - 2; i++) {
            sum += Math.min(b[i], b[i + 1]);
        }
        System.out.println(sum);
    }

}
