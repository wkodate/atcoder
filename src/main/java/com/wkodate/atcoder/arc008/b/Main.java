package com.wkodate.atcoder.arc008.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String nameStr = sc.next();
        String kitStr = sc.next();

        int[] name = new int[26];
        int[] kit = new int[26];
        for (int i = 0; i < n; i++) {
            char c = nameStr.charAt(i);
            name[c - 'A']++;
        }
        for (int i = 0; i < m; i++) {
            char c = kitStr.charAt(i);
            kit[c - 'A']++;
        }
        int ans = 0;
        for (int i = 0; i < 26; i++) {
            if (name[i] == 0) {
                continue;
            }
            if (kit[i] == 0) {
                System.out.println(-1);
                return;
            }
            ans = Math.max(ans, (int) Math.ceil((double) name[i] / kit[i]));
        }
        System.out.println(ans);
    }

}
