package com.wkodate.atcoder.arc019.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if (a.length() == 1) {
            System.out.println(0);
            return;
        }
        int cnt = 0;
        for (int i = 0; i < a.length() / 2; i++) {
            if (a.charAt(i) != a.charAt(a.length() - 1 - i)) {
                cnt++;
            }
        }
        if (cnt == 1) {
            System.out.println(24 * 2 + 25 * (a.length() - 2));
        } else if (cnt == 0 && a.length() % 2 != 0) {
            System.out.println(25 * (a.length() - 1));
        } else {
            System.out.println(25 * a.length());
        }
    }

}
