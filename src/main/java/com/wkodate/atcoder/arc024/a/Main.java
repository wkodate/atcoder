package com.wkodate.atcoder.arc024.a;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        Map<Integer, Integer> lmap = new HashMap<>();
        Map<Integer, Integer> rmap = new HashMap<>();
        for (int i = 0; i < L; i++) {
            int l = sc.nextInt();
            lmap.put(l, lmap.getOrDefault(l, 0) + 1);
        }
        for (int i = 0; i < R; i++) {
            int r = sc.nextInt();
            rmap.put(r, rmap.getOrDefault(r, 0) + 1);
        }
        int ans = 0;
        for (Integer l : lmap.keySet()) {
            if (rmap.containsKey(l)) {
                ans += Math.min(lmap.get(l), rmap.get(l));
            }
        }
        System.out.println(ans);
    }

}
