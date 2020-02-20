package com.wkodate.atcoder.abc040.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            result = Math.min(result, Math.abs(i - n / i) + (n % i));
        }
        System.out.println(result);
    }

}
