package com.wkodate.atcoder.abc027.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        int expected = sum / n;

        if (sum % n != 0) {
            System.out.println(-1);
            return;
        }

        int count = 0;
        int result = 0;
        for (int i = 0; i < n; i++) {
            count += expected - a[i];
            if (count != 0) {
                result++;
            }
        }
        System.out.println(result);
    }

}
