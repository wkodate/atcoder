package com.wkodate.atcoder.code_festival_2014_quala.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = sc.nextInt();
        System.out.println(a.charAt((b - 1) % a.length()));
    }

}
