package com.wkodate.atcoder.abc156.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        if (n >= 10) {
            System.out.println(r);
        } else {
            System.out.println(r + 100 * (10 - n));

        }
    }

}
