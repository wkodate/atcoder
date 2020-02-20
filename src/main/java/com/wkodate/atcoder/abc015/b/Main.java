package com.wkodate.atcoder.abc015.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        double sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                continue;
            }
            sum += a[i];
            count++;
        }
        System.out.println((int) Math.ceil(sum / count));
    }

}
