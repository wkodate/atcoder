package com.wkodate.atcoder.abc120.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (b / a >= c) {
            System.out.println(c);
            return;
        }
        System.out.println(b / a);
    }

}
