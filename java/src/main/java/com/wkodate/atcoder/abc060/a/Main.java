package com.wkodate.atcoder.abc060.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.next().split("");
        String[] b = sc.next().split("");
        String[] c = sc.next().split("");
        if (a[a.length - 1].equals(b[0])
                && b[b.length - 1].equals(c[0])) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }

}
