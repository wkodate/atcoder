package com.wkodate.atcoder.abc027.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int l3 = sc.nextInt();
        if (l1 == l2) {
            System.out.println(l3);
        } else {
            if (l1 == l3) {
                System.out.println(l2);
            } else {
                System.out.println(l1);
            }
        }
    }

}
