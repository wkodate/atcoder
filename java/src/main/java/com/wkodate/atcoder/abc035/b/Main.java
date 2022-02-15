package com.wkodate.atcoder.abc035.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        int[] p = new int[n];
        String maxS = "";
        int maxP = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            p[i] = sc.nextInt();
            sum += p[i];
            if (p[i] > maxP) {
                maxS = s[i];
                maxP = p[i];
            }
        }

        if (2 * maxP > sum) {
            System.out.println(maxS);
            return;
        }
        System.out.println("atcoder");
    }

}
