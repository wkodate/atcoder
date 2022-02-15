package com.wkodate.atcoder.arc045.a;

import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < s.length; i++) {
            if ("Left".equals(s[i])) {
                sj.add("<");
            } else if ("Right".equals(s[i])) {
                sj.add(">");
            } else {
                sj.add("A");
            }
        }
        System.out.println(sj);
    }

}
