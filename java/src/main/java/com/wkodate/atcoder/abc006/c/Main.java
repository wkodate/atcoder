package com.wkodate.atcoder.abc006.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (m < 2 * n || m > 4 * n) {
            System.out.println("-1 -1 -1");
            return;
        }
        int nnn = 3 * n;
        if (nnn < m) {
            System.out.println("0 " + (n - (m - nnn)) + " " + (m - nnn));
        } else if (nnn > m) {
            System.out.println((nnn - m) + " " + (n - (nnn - m)) + " 0");
        } else {
            System.out.println("0 " + n + " 0");
        }
    }

}
