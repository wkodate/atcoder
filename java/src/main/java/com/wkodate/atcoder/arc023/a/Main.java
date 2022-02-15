package com.wkodate.atcoder.arc023.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] y = new int[2];
        int[] m = new int[2];
        int[] d = new int[2];
        y[0] = sc.nextInt();
        m[0] = sc.nextInt();
        if (m[0] <= 2) {
            y[0]--;
            m[0] += 12;
        }
        d[0] = sc.nextInt();
        y[1] = 2014;
        m[1] = 5;
        d[1] = 17;
        int[] date = new int[2];
        for (int i = 0; i < 2; i++) {
            date[i] = 365 * y[i] + (y[i] / 4) - (y[i] / 100) + (y[i] / 400)
                      + (306 * (m[i] + 1) / 10) + d[i] - 429;
        }
        System.out.println(date[1] - date[0]);
    }

}
