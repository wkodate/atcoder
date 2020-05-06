package com.wkodate.atcoder.arc049.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i == a || i == b || i == c || i == d) {
                sb.append("\"");
            }
            sb.append(ch);
        }
        if (d == s.length()) {
            sb.append("\"");
        }
        System.out.println(sb);
    }

}
