package com.wkodate.atcoder.abc028.b;

import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        int[] counter = new int[6];
        for (int i = 0; i < s.length; i++) {
            if ("A".equals(s[i])) {
                counter[0]++;
            } else if ("B".equals(s[i])) {
                counter[1]++;
            } else if ("C".equals(s[i])) {
                counter[2]++;
            } else if ("D".equals(s[i])) {
                counter[3]++;
            } else if ("E".equals(s[i])) {
                counter[4]++;
            } else if ("F".equals(s[i])) {
                counter[5]++;
            }
        }
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < 6; i++) {
            sj.add(String.valueOf(counter[i]));
        }
        System.out.println(sj.toString());
    }

}
