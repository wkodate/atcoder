package com.wkodate.atcoder.abc155.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b != c || b == c && c != a || c == a && a != b) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

}
