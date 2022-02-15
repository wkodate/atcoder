package com.wkodate.atcoder.arc054.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();
        long s = sc.nextLong();
        long d = sc.nextLong();
        if (s < d) {
            if (x >= y) {
                System.out.println((double) (d - s) / (x + y));
            } else {
                System.out.println(Math.min((double) (d - s) / (x + y), (double) (s + l - d) / (y - x)));
            }
        } else {
            if (x >= y) {
                System.out.println((double) (l - s + d) / (x + y));
            } else {
                System.out.println(Math.min((double) (l - s + d) / (x + y), (double) (s - d) / (y - x)));
            }
        }
    }

}
