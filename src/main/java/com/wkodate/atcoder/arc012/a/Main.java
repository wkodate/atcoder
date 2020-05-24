package com.wkodate.atcoder.arc012.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.next();
        if ("Monday".equals(day)) {
            System.out.println(5);
        } else if ("Tuesday".equals(day)) {
            System.out.println(4);
        } else if ("Wednesday".equals(day)) {
            System.out.println(3);
        } else if ("Thursday".equals(day)) {
            System.out.println(2);
        } else if ("Friday".equals(day)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

}
