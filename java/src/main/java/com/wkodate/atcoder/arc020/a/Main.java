package com.wkodate.atcoder.arc020.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (Math.abs(a) < Math.abs(b)) {
            System.out.println("Ant");
        } else if (Math.abs(a) > Math.abs(b)) {
            System.out.println("Bug");
        } else {
            System.out.println("Draw");
        }
    }

}
