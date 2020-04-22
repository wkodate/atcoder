package com.wkodate.atcoder.arc030.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (n / k >= 2) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }

}
