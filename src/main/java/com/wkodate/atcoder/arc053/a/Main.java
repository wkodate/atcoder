package com.wkodate.atcoder.arc053.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        System.out.println((h - 1) * w + h * (w - 1));
    }

}
