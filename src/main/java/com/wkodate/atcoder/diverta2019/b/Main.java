package com.wkodate.atcoder.diverta2019.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i <= n / r; i++) {
            for (int j = 0; j <= n / g; j++) {
                if (r * i + g * j > n) {
                    break;
                }
                if ((n - r * i - g * j) % b == 0) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

}
