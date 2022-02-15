package com.wkodate.atcoder.arc016.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] x = new String[n][9];
        for (int i = 0; i < n; i++) {
            x[i] = sc.next().split("");
        }
        long sum = 0;
        for (int i = 0; i < 9; i++) {
            boolean pushing = false;
            for (int j = 0; j < n; j++) {
                if ("x".equals(x[j][i])) {
                    sum++;
                    pushing = false;
                    continue;
                }
                if (!pushing && "o".equals(x[j][i])) {
                    pushing = true;
                    sum++;
                    continue;
                }
                if (".".equals(x[j][i])) {
                    pushing = false;
                }
            }
        }
        System.out.println(sum);
    }

}
