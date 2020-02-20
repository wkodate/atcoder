package com.wkodate.atcoder.abc029.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = new String[12];
        int count = 0;
        for (int i = 0; i < 12; i++) {
            s[i] = sc.next();
        }
        for (int i = 0; i < 12; i++) {
            if (s[i].contains("r")) {
                count++;
            }
        }
        System.out.println(count);
    }

}
