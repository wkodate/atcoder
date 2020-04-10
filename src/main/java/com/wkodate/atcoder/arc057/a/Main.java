package com.wkodate.atcoder.arc057.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        int k = sc.nextInt();
        if (k == 0) {
            System.out.println(2_000_000_000_000L - a);
            return;
        }
        long ans = 0;
        while (true) {
            if (a >= 2_000_000_000_000L) {
                System.out.println(ans);
                return;
            }
            a += 1 + k * a;
            ans++;
        }
    }

}
