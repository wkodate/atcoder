package com.wkodate.atcoder.arc028.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = 0;
        while (n > 0) {
            if (i % 2 == 0) {
                n -= a;
            } else {
                n -= b;
            }
            i++;
        }
        if (i % 2 != 0) {
            System.out.println("Ant");
        } else {
            System.out.println("Bug");
        }
    }

}
