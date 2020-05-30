package com.wkodate.atcoder.hitachi2020.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.replaceAll("hi", "");
        if ("".equals(s)) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

}
