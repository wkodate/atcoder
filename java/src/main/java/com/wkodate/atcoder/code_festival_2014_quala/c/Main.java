package com.wkodate.atcoder.code_festival_2014_quala.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println((b / 4 - b / 100 + b / 400) - ((a - 1) / 4 - (a - 1) / 100 + (a - 1) / 400));
    }

}
