package com.wkodate.atcoder.abc155.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                continue;
            }
            if (a[i] % 3 != 0 && a[i] % 5 != 0) {
                System.out.println("DENIED");
                return;
            }
        }
        System.out.println("APPROVED");
    }

}
