package com.wkodate.atcoder.abc069.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String middle = s.substring(1, s.length() - 1);
        System.out.println(s.substring(0, 1) + middle.length() + s.substring(s.length() - 1));
    }

}
