package com.wkodate.atcoder.abc172.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        int ans = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] != t[i]) {
                ans++;
            }
        }
        System.out.println(ans);
    }

}
