package com.wkodate.atcoder.abc158.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if ("AAA".equals(s) || "BBB".equals(s)) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }

}
