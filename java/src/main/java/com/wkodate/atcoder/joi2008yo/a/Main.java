package com.wkodate.atcoder.joi2008yo.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = 1000 - n;
        int cnt = 0;
        int[] coin = { 500, 100, 50, 10, 5, 1 };
        for (int i = 0; i < coin.length; i++) {
            while (n >= coin[i]) {
                n -= coin[i];
                cnt++;
            }
        }
        System.out.println(cnt);
    }

}
