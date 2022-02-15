package com.wkodate.atcoder.arc008.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((n / 10) * 100 + Math.min((n % 10) * 15, 100));
    }

}
