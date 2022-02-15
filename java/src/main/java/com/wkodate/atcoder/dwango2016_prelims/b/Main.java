package com.wkodate.atcoder.dwango2016_prelims.b;

import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] k = new long[n];
        for (int i = 0; i < n - 1; i++) {
            k[i] = sc.nextLong();
        }
        StringJoiner sj = new StringJoiner(" ");
        sj.add(String.valueOf(k[0]));
        for (int i = 1; i < n - 1; i++) {
            sj.add(String.valueOf(Math.min(k[i - 1], k[i])));
        }
        sj.add(String.valueOf(k[n - 2]));
        System.out.println(sj);
    }

}
