package com.wkodate.atcoder.abc161.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        System.out.println(Math.min(n % k, Math.abs(n % k - k)));
    }

}
