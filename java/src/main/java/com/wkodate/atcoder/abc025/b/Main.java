package com.wkodate.atcoder.abc025.b;

import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String[] s = new String[n];
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            d[i] = sc.nextInt();
        }
        int pos = 0;
        for (int i = 0; i < n; i++) {
            int distance = d[i];
            if (distance < a) {
                distance = a;
            } else if (distance > b) {
                distance = b;
            }
            if ("East".equals(s[i])) {
                pos += distance;
            } else {
                pos -= distance;
            }
        }
        StringJoiner sj = new StringJoiner(" ");
        if (pos > 0) {
            sj.add("East");
        } else if (pos < 0) {
            sj.add("West");

        }
        sj.add(String.valueOf(Math.abs(pos)));
        System.out.println(sj.toString());
    }

}
