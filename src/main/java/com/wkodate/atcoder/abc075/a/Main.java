package com.wkodate.atcoder.abc075.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b) {
            System.out.println(c);
            return;
        }
        if (a == c) {
            System.out.println(b);
            return;
        }
        System.out.println(a);
    }

}
