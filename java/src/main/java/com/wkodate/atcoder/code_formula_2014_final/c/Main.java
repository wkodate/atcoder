package com.wkodate.atcoder.code_formula_2014_final.c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        Set<String> set = new HashSet<>();
        for (int i = 0; i < s.length; i++) {
            StringBuilder sb = new StringBuilder();
            boolean atmark = false;
            for (int j = 0; j < s[i].length(); j++) {
                char c = s[i].charAt(j);
                if (c == '@') {
                    if (sb.length() > 0) {
                        set.add(sb.toString());
                        sb = new StringBuilder();
                    }
                    atmark = true;
                } else {
                    if (atmark) {
                        sb.append(c);
                    }
                }
            }
            if (sb.length() > 0) {
                set.add(sb.toString());
            }
        }
        List<String> ans = new ArrayList<>(set);
        Collections.sort(ans);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }

}
