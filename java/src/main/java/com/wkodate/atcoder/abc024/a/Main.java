package com.wkodate.atcoder.abc024.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();
        if (s + t >= k) {
            System.out.println(s * a + t * b - (s + t) * c);
            return;
        }
        System.out.println(s * a + t * b);
    }

}
