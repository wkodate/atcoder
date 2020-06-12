package com.wkodate.atcoder.arc011.b;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    private static Map<Character, Integer> map = new HashMap<Character, Integer>() {
        {
            put('b', 1);
            put('c', 1);
            put('d', 2);
            put('w', 2);
            put('t', 3);
            put('j', 3);
            put('f', 4);
            put('q', 4);
            put('l', 5);
            put('v', 5);
            put('s', 6);
            put('x', 6);
            put('p', 7);
            put('m', 7);
            put('h', 8);
            put('k', 8);
            put('n', 9);
            put('g', 9);
            put('z', 0);
            put('r', 0);
        }
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] w = new String[n];
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < n; i++) {
            w[i] = sc.next().toLowerCase();
            StringBuilder replaced = new StringBuilder();
            for (int j = 0; j < w[i].length(); j++) {
                char c = w[i].charAt(j);
                if (!map.containsKey(c)) {
                    continue;
                }
                replaced.append(map.get(c));
            }
            if (replaced.length() > 0) {
                sj.add(replaced);
            }
        }
        System.out.println(sj);
    }

}
