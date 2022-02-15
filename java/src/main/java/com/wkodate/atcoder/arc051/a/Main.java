package com.wkodate.atcoder.arc051.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int r = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        if (x1 - r < x2 || x1 + r > x3 || y1 + r > y3 || y1 - r < y2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        if (Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)) > r
            || Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y2, 2)) > r
            || Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y3, 2)) > r
            || Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2)) > r) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
