package com.wkodate.atcoder.abc051.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String replaced = s.replaceAll(",", " ");
        System.out.println(replaced);
    }

}
