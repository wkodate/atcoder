package com.wkodate.atcoder.abc030.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if ((double) b / a > (double) d / c) {
            System.out.println("TAKAHASHI");
        } else if ((double) b / a < (double) d / c) {
            System.out.println("AOKI");
        } else {
            System.out.println("DRAW");
        }
    }

}
