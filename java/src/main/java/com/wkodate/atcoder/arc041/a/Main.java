package com.wkodate.atcoder.arc041.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int k = sc.nextInt();
        if (y >= k) {
            System.out.println(x + k);
            return;
        }
        System.out.println(x + 2 * y - k);
    }

}
