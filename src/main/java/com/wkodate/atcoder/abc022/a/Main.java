package com.wkodate.atcoder.abc022.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (sum >= s && sum <= t) {
                count++;
            }
        }
        System.out.println(count);
    }

}
