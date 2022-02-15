package com.wkodate.atcoder.abc109.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ((a * b % 2) == 1) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

}
