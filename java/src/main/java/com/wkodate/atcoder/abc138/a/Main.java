package com.wkodate.atcoder.abc138.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = sc.next();
        if (a >= 3200) {
            System.out.println(s);
            return;
        }
        System.out.println("red");
    }

}
