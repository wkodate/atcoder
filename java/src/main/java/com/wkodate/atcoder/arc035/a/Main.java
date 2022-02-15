package com.wkodate.atcoder.arc035.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char reversed = s.charAt(s.length() - i - 1);
            if (c == '*' || reversed == '*' || c == reversed) {
                continue;
            }
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }

}
