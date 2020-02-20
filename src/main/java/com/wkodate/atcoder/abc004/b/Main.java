package com.wkodate.atcoder.abc004.b;

import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] c = new String[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                c[i][j] = sc.next();
            }
        }
        for (int i = 0; i < 4; i++) {
            StringJoiner sj = new StringJoiner(" ");
            for (int j = 0; j < 4; j++) {
                sj.add(c[4 - i - 1][4 - j - 1]);
            }
            System.out.println(sj.toString());
        }
    }

}
