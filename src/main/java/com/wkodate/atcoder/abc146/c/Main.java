package com.wkodate.atcoder.abc146.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        long l = 0;
        long r = 1000000000;
        while (r - l > 1) {
            long m = (l + r) / 2;
            long price = a * m + b * String.valueOf(m).length();
            if (price <= x) {
                l = m;
            } else {
                r = m;
            }
        }
        if (a * r + b * String.valueOf(r).length() <= x) {
            System.out.println(r);
        } else {
            System.out.println(l);
        }
    }

}
