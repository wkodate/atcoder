package com.wkodate.atcoder.abc023.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String[] s = String.valueOf(x).split("");
        int sum = 0;
        for (int i = 0; i < s.length; i++) {
            sum += Integer.parseInt(s[i]);
        }
        System.out.println(sum);
    }

}
