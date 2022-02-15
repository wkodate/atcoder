package com.wkodate.atcoder.joi2010yo.d;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static Set<String> set = new HashSet<>();

    private static void permutate(int[] c, String word, int cnt, int k) {
        if (cnt == k) {
            set.add(word);
            return;
        }
        for (int i = 0; i < c.length; i++) {
            int[] removed = new int[c.length - 1];
            int idx = 0;
            for (int j = 0; j < c.length; j++) {
                if (i == j) {
                    continue;
                }
                removed[idx++] = c[j];
            }
            permutate(removed, word + c[i], 1 + cnt, k);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        permutate(c, "", 0, k);
        System.out.println(set.size());
    }

}
