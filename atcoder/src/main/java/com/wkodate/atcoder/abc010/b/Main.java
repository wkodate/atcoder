package com.wkodate.atcoder.abc010.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            while (a[i] % 3 == 2 || a[i] % 2 == 0) {
                a[i]--;
                count++;
            }
        }
        System.out.println(count);
    }

}
