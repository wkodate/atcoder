package com.wkodate.atcoder.yahoo2019.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if ((n + 1) / 2 >= k) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }

}
