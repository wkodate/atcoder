package com.wkodate.atcoder.mujin_pc_2016.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loa = sc.nextInt();
        int lab = sc.nextInt();
        int lbc = sc.nextInt();
        int r1 = loa + lab + lbc;
        int r2 = 0;
        if (loa >= lab + lbc || lab >= lbc + loa || lbc >= loa + lab) {
            r2 = Math.min(Math.abs(loa + lab - lbc),
                          Math.min(Math.abs(loa - lab + lbc), Math.abs(loa - lab - lbc)));
        }
        System.out.println((r1 * r1 - r2 * r2) * Math.PI);
    }

}
