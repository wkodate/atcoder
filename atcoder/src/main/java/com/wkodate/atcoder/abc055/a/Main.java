package com.wkodate.atcoder.abc055.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 800 * n;
        int y = 200 * (n / 15);
        System.out.println(x - y);
    }

}
