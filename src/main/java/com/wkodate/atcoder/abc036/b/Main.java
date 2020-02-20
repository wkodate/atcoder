package com.wkodate.atcoder.abc036.b;

import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] s = new String[n][n];
        String[][] result = new String[n][n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next().split("");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = s[n - j - 1][i];
            }
        }
        for (int i = 0; i < n; i++) {
            StringJoiner sj = new StringJoiner("");
            for (int j = 0; j < n; j++) {
                sj.add(result[i][j]);
            }
            System.out.println(sj.toString());
        }
    }
}
