package com.wkodate.virtual_contest.kujikatsu22_200706.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        char[] s = sc.next().toCharArray();
        for (int i = a - 1; i <= c - 1; i++) {
            if (s[i] == '#' && s[i + 1] == '#') {
                System.out.println("No");
                return;
            }
        }
        for (int i = b - 1; i <= d - 1; i++) {
            if (s[i] == '#' && s[i + 1] == '#') {
                System.out.println("No");
                return;
            }
        }
        if (c > d) {
            boolean canJump = false;
            for (int i = b - 1; i <= d - 1; i++) {
                if (s[i - 1] == '.' && s[i] == '.' && s[i + 1] == '.') {
                    canJump = true;
                }
            }
            if (!canJump) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

}
