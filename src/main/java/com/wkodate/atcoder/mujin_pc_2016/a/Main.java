package com.wkodate.atcoder.mujin_pc_2016.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        if ("O".equals(c) || "P".equals(c) || "K".equals(c) || "L".equals(c)) {
            System.out.println("Right");
            return;
        }
        System.out.println("Left");
    }

}
