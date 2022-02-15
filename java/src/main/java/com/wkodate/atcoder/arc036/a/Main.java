package com.wkodate.atcoder.arc036.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        int sum = t[0] + t[1] + t[2];
        if (sum < k) {
            System.out.println(3);
            return;
        }
        for (int i = 3; i < n; i++) {
            sum -= t[i - 3];
            sum += t[i];
            if (sum < k) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(-1);
    }

}
