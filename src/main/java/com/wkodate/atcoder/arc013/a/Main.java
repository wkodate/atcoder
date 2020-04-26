package com.wkodate.atcoder.arc013.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();

        int psqare = Math.max((n / p) * (m / q) * (l / r), (n / p) * (m / r) * (l / q));
        int qsqare = Math.max((n / q) * (m / r) * (l / p), (n / q) * (m / p) * (l / r));
        int rsqare = Math.max((n / r) * (m / p) * (l / q), (n / r) * (m / q) * (l / p));
        System.out.println(Math.max(psqare, Math.max(qsqare, rsqare)));
    }

}
