package com.wkodate.atcoder.agc037.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = 0;
        int ans = 0;
        String prev = "";
        while (i < s.length()) {
            String str;
            ans++;
            if (prev.length() == 1 && prev.equals(s.substring(i, i + 1))) {
                if (i + 2 > s.length()) {
                    ans--;
                    break;
                }
                str = s.substring(i, i + 2);
                i++;
            } else {
                str = s.substring(i, i + 1);
            }
            i++;
            prev = str;
        }
        System.out.println(ans);
    }

}

