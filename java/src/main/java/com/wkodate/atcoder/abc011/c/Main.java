package com.wkodate.atcoder.abc011.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ng = new int[3];
        for (int i = 0; i < ng.length; i++) {
            ng[i] = sc.nextInt();
        }
        if (ng[0] == n || ng[1] == n || ng[2] == n) {
            System.out.println("NO");
            return;
        }
        for (int i = 0; i < 100; i++) {
            for (int j = 3; j > 0; j--) {
                if (n - j == ng[0] || n - j == ng[1] || n - j == ng[2]) {
                    continue;
                }
                n -= j;
                break;
            }
        }
        if (n > 0) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }

}
