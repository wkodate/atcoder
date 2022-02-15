package com.wkodate.atcoder.digitalarts2012.a;

import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int n = sc.nextInt();
        String[] t = new String[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.next();
        }
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < n; j++) {
                if (s[i].length() != t[j].length()) {
                    continue;
                }
                boolean match = true;
                for (int k = 0; k < s[i].length(); k++) {
                    char cs = s[i].charAt(k);
                    char ct = t[j].charAt(k);
                    if (ct != '*' && cs != ct) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    StringBuilder sb = new StringBuilder();
                    for (int k = 0; k < s[i].length(); k++) {
                        sb.append('*');
                    }
                    s[i] = sb.toString();
                    break;
                }
            }
        }
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < s.length; i++) {
            sj.add(s[i]);
        }
        System.out.println(sj);
    }

}
