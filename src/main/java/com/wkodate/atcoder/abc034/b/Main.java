package com.wkodate.atcoder.abc034.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n % 2 == 0) {
            System.out.println(n - 1);
            return;
        }
        System.out.println(n + 1);
    }

}
