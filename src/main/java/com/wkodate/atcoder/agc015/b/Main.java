package com.wkodate.atcoder.agc015.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        long sum = 0;
        for (int i = 0; i < s.length; i++) {
            if ("U".equals(s[i])) {
                sum += 2 * i + (s.length - i - 1);
                continue;
            }
            sum += i + 2 * (s.length - i - 1);
        }
        System.out.println(sum);
    }

}
