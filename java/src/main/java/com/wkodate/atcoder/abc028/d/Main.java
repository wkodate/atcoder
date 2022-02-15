package com.wkodate.atcoder.abc028.d;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println((((double) (k - 1) * (n - k) * 6) + (n - 1) * 3 + 1) / Math.pow(n, 3));
    }

}
