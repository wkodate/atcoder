package com.wkodate.atcoder.arc047.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        String s = sc.next();
        int tab = 1;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '+') {
                tab++;
                if (tab > l) {
                    ans++;
                    tab = 1;
                }
            } else {
                tab--;
            }
        }
        System.out.println(ans);
    }

}
