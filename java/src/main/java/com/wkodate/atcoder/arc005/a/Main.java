package com.wkodate.atcoder.arc005.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            if (i == n - 1) {
                s[i] = s[i].substring(0, s[i].length() - 1);
            }
            if ("takahashikun".equals(s[i].toLowerCase())) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

}
