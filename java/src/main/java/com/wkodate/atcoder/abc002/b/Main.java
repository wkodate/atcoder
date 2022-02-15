package com.wkodate.atcoder.abc002.b;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'i', 'u', 'e', 'o'));
        for (int i = 0; i < w.length(); i++) {
            char c = w.charAt(i);
            if (set.contains(c)){
                continue;
            }
            sb.append(c);
        }
        System.out.println(sb);
    }

}
