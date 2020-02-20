package com.wkodate.atcoder.abc034.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x < y) {
            System.out.println("Better");
            return;
        }
        System.out.println("Worse");
    }

}
