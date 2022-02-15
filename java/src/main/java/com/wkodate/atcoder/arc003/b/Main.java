package com.wkodate.atcoder.arc003.b;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = new StringBuilder(sc.next()).reverse().toString();
        }
        Arrays.sort(s);
        for (int i = 0; i < n; i++) {
            System.out.println(new StringBuilder(s[i]).reverse());
        }
    }

}
