package com.wkodate.atcoder.code_festival_2014_final.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int n = Integer.parseInt(String.valueOf(s.charAt(i)));
            if (i % 2 == 0) {
                sum += n;
            } else {
                sum -= n;
            }
        }
        System.out.println(sum);
    }

}
