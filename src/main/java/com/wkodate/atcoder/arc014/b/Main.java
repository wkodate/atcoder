package com.wkodate.atcoder.arc014.b;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] w = new String[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.next();
        }

        Set<String> words = new HashSet<>();
        words.add(w[0]);
        char start = w[0].charAt(w[0].length() - 1);
        for (int i = 1; i < n; i++) {
            if (words.contains(w[i]) || start != w[i].charAt(0)) {
                if (i % 2 != 0) {
                    System.out.println("WIN");
                } else {
                    System.out.println("LOSE");
                }
                return;
            }
            words.add(w[i]);
            start = w[i].charAt(w[i].length() - 1);
        }
        System.out.println("DRAW");
    }

}
