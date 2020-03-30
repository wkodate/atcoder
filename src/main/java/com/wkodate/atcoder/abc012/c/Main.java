package com.wkodate.atcoder.abc012.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                sum += i * j;
            }
        }
        int m = sum - n;
        for (int i = 1; i <= 9; i++) {
            if (m % i == 0 && m / i <= 9) {
                System.out.println(i + " x " + (m / i));
            }
        }
    }

}
