package com.wkodate.atcoder.arc050.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String C = sc.next();
        String c = sc.next();
        if (C.toLowerCase().equals(c)) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

}
