package com.wkodate.atcoder.abc170.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 1;
        for (int i = 1; i <= 5; i++) {
            int x = sc.nextInt();
            if (x == 0) {
                ans = i;
            }
        }
        System.out.println(ans);
    }

}
