package com.wkodate.virtual_contest.kujikatsu22_200706.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((int) Math.ceil((double) (a + b) / 2));
    }

}
