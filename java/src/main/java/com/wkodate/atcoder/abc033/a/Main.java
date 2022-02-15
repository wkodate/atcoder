package com.wkodate.atcoder.abc033.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.next().split("");
        for (int i = 1; i < n.length; i++) {
            if (!n[i].equals(n[0])) {
                System.out.println("DIFFERENT");
                return;
            }
        }
        System.out.println("SAME");
    }

}
