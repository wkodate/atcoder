package com.wkodate.atcoder.abc081.b;

import java.util.Scanner;

public class Main {

    private static boolean hasOdd(long[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        int count = 0;
        while (true) {
            if (hasOdd(a)) {
                break;
            }
            count++;
            for (int i = 0; i < n; i++) {
                a[i] /= 2;
            }
        }
        System.out.println(count);
    }

}
