package com.wkodate.atcoder.abc003.b;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        Set<Character> set = new HashSet<>(Arrays.asList('a', 't', 'c', 'o', 'd', 'e', 'r'));
        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if (cs == ct || cs == '@' && set.contains(ct) || set.contains(cs) && ct == '@') {
                continue;
            }
            System.out.println("You will lose");
            return;
        }
        System.out.println("You can win");
    }

}
