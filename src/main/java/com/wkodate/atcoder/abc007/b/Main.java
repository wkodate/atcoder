package com.wkodate.atcoder.abc007.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] ar = a.split("");
        String lastChar = ar[ar.length - 1];
        if (ar.length == 1 && "a".equals(lastChar)) {
            System.out.println("-1");
            return;
        }
        System.out.println("a");
    }

}
