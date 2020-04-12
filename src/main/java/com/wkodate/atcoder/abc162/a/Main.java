package com.wkodate.atcoder.abc162.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (String.valueOf(n).contains("7")) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

}
