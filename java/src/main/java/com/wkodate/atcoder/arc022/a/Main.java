package com.wkodate.atcoder.arc022.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] ict = { "i", "c", "t" };
        int j = 0;
        for (int i = 0; i < s.length() && j <= 2; i++) {
            String str = String.valueOf(s.charAt(i));
            if (str.toLowerCase().equals(ict[j])) {
                j++;
            }
        }
        if (j > 2) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }

}
