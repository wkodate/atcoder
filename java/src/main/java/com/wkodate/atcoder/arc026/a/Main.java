package com.wkodate.atcoder.arc026.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(b * Math.min(n, 5) + a * Math.max(n - 5, 0));
    }

}
