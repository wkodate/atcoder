package com.wkodate.atcoder.arc040.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        int t = 0;
        int a = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < s[i].length(); j++) {
                char c = s[i].charAt(j);
                if (c == 'R') {
                    t++;
                } else if (c == 'B') {
                    a++;
                }
            }
        }
        if (t > a) {
            System.out.println("TAKAHASHI");
        } else if (t < a) {
            System.out.println("AOKI");
        } else {
            System.out.println("DRAW");
        }
    }

}
