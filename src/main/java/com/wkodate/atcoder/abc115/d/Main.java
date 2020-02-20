package com.wkodate.atcoder.abc115.d;

import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static String createLevelBurger(int l) {
        StringJoiner sj = new StringJoiner("");
        if (l >= 1) {
            sj.add("B");
            sj.add(createLevelBurger(l - 1));
            sj.add("P");
            sj.add(createLevelBurger(l - 1));
            sj.add("B");
        } else {
            sj.add("P");
        }
        return sj.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        String[] nBurger = createLevelBurger(n).split("");
        long count = 0;
        for (int i = 0; i < x; i++) {
            if (nBurger[i].equals("P")) {
                count++;
            }
        }
        System.out.println(count);
    }
}

