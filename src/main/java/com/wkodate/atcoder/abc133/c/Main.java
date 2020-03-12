package com.wkodate.atcoder.abc133.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();
        long i = l;
        long j = l + 1;
        long k = l;
        while (k <= l + 2019 && k <= r) {
            if (k % 2019 <= i % 2019) {
                j = i;
                i = k;
            }
            k++;
        }
        System.out.println(i % 2019 * j % 2019);
    }
}
