package com.wkodate.atcoder.abc021.b;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        int[] p = new int[k];
        for (int i = 0; i < k; i++) {
            p[i] = sc.nextInt();
        }

        Arrays.sort(p);
        for (int i = 0; i < k; i++) {
            if (p[i] == a
                    || p[i] == b
                    || i != k - 1 && p[i] == p[i + 1]) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

}
