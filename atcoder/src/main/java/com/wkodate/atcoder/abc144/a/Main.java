package com.wkodate.atcoder.abc144.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < 1 || a > 9 || b < 1 || b > 9) {
            System.out.println(-1);
            return;
        }
        System.out.println(a * b);
    }

}
