package com.wkodate.atcoder.abc046.d;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'p') {
                p++;
            }
        }
        System.out.println(s.length() / 2 - p);
    }

}
