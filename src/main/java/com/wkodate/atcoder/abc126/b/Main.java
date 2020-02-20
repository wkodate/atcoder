package com.wkodate.atcoder.abc126.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        int former = Integer.parseInt(s[0] + s[1]);
        int latter = Integer.parseInt(s[2] + s[3]);
        if ((former < 1 || former > 12)
                && (latter < 1 || latter > 12)) {
            System.out.println("NA");
            return;
        }
        if ((former >= 1 && former <= 12)
                && (latter >= 1 && latter <= 12)) {
            System.out.println("AMBIGUOUS");
            return;
        }
        if (former >= 1 && former <= 12) {
            System.out.println("MMYY");
            return;
        }
        System.out.println("YYMM");
    }

}
