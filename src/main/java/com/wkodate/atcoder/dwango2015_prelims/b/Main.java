package com.wkodate.atcoder.dwango2015_prelims.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long cnt = 0;
        long ans = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            if (c == '2' && s.charAt(i + 1) == '5') {
                i++;
                cnt++;
                continue;
            }
            if (cnt > 0) {
                ans += cnt * (cnt + 1) / 2;
                cnt = 0;
            }
        }
        ans += cnt * (cnt + 1) / 2;
        System.out.println(ans);
    }

}
