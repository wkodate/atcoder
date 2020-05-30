package com.wkodate.atcoder.arc002.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if (y % 400 != 0 && y % 100 != 0 && y % 4 != 0) {
            System.out.println("NO");
        }
        if (y % 400 == 0) {
            System.out.println("YES");
        } else if (y % 100 == 0) {
            System.out.println("NO");
        } else if (y % 4 == 0) {
            System.out.println("YES");
        }
    }

}
