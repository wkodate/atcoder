package com.wkodate.atcoder.abc046.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        long count = (long) (k * Math.pow(k - 1, n - 1));
        System.out.println(count);
    }

}
