package com.wkodate.atcoder.arc037.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
            sum += Math.max(80 - m[i], 0);
        }
        System.out.println(sum);
    }

}
