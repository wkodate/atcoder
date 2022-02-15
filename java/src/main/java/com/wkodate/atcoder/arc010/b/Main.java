package com.wkodate.atcoder.arc010.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][] md = new boolean[13][32];
        for (int i = 0; i < n; i++) {
            String[] s = sc.next().split("/");
            md[Integer.parseInt(s[0])][Integer.parseInt(s[1])] = true;
        }
        int day = 0;
        int ans = 2;
        int cnt = 0;
        int transfer = 0;
        for (int i = 1; i <= 12; i++) {
            int dend = 31;
            if (i == 4 || i == 6 || i == 9 || i == 11) {
                dend = 30;
            } else if (i == 2) {
                dend = 29;
            }
            for (int j = 1; j <= dend; j++) {
                day++;
                if (day % 7 == 0 || day % 7 == 1) {
                    if (md[i][j]) {
                        transfer++;
                    }
                    cnt++;
                } else if (md[i][j]) {
                    cnt++;
                } else if (transfer > 0) {
                    transfer--;
                    cnt++;
                } else {
                    ans = Math.max(cnt, ans);
                    cnt = 0;
                }
            }
        }
        ans = Math.max(cnt, ans);
        System.out.println(ans);
    }

}
