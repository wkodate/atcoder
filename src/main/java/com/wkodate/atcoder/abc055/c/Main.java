package com.wkodate.atcoder.abc055.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        if (2 * n >= m) {
            System.out.println(m / 2);
            return;
        }
        System.out.println(n + (m - 2 * n) / 4);
    }

}
