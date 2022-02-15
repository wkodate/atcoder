package com.wkodate.atcoder.abc026.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int max = 0;
        for (int i = 1; i <= a / 2; i++) {
            max = Math.max(i * (a - i), max);
        }
        System.out.println(max);
    }

}
