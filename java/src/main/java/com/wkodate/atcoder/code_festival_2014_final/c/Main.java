package com.wkodate.atcoder.code_festival_2014_final.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        for (int i = 10; i <= 10000; i++) {
            long fn = 0;
            long n = i;
            int j = 0;
            while (n > 0) {
                fn += (n % 10) * Math.pow(i, j);
                n /= 10;
                j++;
            }
            if (fn == a) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }

}
