package com.wkodate.atcoder.abc170.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (y % 2 == 0 && 4 * x >= y && 2 * x <= y) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
