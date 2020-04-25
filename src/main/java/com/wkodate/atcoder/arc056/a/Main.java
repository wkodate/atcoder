package com.wkodate.atcoder.arc056.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        long l = sc.nextLong();
        System.out.println(Math.min(a * k, k / l * b + Math.min(b, (k - l * (k / l)) * a)));
    }

}
