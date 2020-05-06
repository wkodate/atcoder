package com.wkodate.atcoder.abc001.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        if (m < 100) {
            sb.append("00");
        } else if (m <= 5_000) {
            sb.append(String.format("%02d", m / 100));
        } else if (m <= 30_000) {
            sb.append(m / 1000 + 50);
        } else if (m <= 70_000) {
            sb.append((m / 1000 - 30) / 5 + 80);
        } else {
            sb.append(89);
        }
        System.out.println(sb);
    }

}
