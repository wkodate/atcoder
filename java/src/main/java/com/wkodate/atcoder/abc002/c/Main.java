package com.wkodate.atcoder.abc002.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xa = sc.nextInt();
        int ya = sc.nextInt();
        int xb = sc.nextInt();
        int yb = sc.nextInt();
        int xc = sc.nextInt();
        int yc = sc.nextInt();

        double ab = Math.sqrt(Math.pow(xa - xb, 2) + Math.pow(ya - yb, 2));
        double bc = Math.sqrt(Math.pow(xb - xc, 2) + Math.pow(yb - yc, 2));
        double ca = Math.sqrt(Math.pow(xc - xa, 2) + Math.pow(yc - ya, 2));
        double s = (ab + bc + ca) / 2;
        double area = Math.sqrt(s * (s - ab) * (s - bc) * (s - ca));
        System.out.println(area);
    }

}
