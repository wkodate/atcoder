package com.wkodate.atcoder.arc048.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if (a * b <= -1) {
            System.out.println(b - a - 1);
            return;
        }
        System.out.println(b - a);
    }

}
