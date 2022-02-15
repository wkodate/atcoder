package com.wkodate.atcoder.abc003.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * 10000;
        }
        System.out.println(sum / n);
    }

}
