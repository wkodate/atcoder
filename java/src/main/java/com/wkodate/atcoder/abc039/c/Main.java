package com.wkodate.atcoder.abc039.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        final String[] SCALE = new String[]{"Do", "Re", "Mi", "Fa", "So", "La", "Si"};
        String b = "WBWBWWBWBWBW";
        for (int i = 0; i < 6; i++) {
            if (s.startsWith(b)) {
                System.out.println(SCALE[i]);
                return;
            }
            if (i == 2) {
                b = b.substring(1);
            } else {
                b = b.substring(2);
            }
        }
        System.out.println(SCALE[6]);
    }

}
