package com.wkodate.atcoder.abc081.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("1")) {
                count++;
            }
        }
        System.out.println(count);
    }

}
