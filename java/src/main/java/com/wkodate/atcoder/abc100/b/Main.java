package com.wkodate.atcoder.abc100.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();
        System.out.println((int) ((n + n / 100) * Math.pow(100, d)));
    }

}
