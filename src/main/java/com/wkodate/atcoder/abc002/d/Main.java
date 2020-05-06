package com.wkodate.atcoder.abc002.d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[m];
        int[] y = new int[m];
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, new HashSet<>());
        }
        for (int i = 0; i < m; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            Set<Integer> sx = map.get(x[i]);
            sx.add(y[i]);
            map.put(x[i], sx);
            Set<Integer> sy = map.get(y[i]);
            sy.add(x[i]);
            map.put(y[i], sy);
        }
        int ans = 1;
        for (int bit = 0; bit < (1 << n); bit++) {
            boolean group = true;
            List<Integer> grpList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((1 & (bit >> i)) == 1) {
                    grpList.add(i + 1);
                }
            }
            for (int i = 0; i < grpList.size(); i++) {
                int mem = grpList.get(i);
                for (int j = 0; j < grpList.size(); j++) {
                    int target = grpList.get(j);
                    Set<Integer> set = map.get(mem);
                    if (!set.contains(target) && target != mem) {
                        group = false;
                        break;
                    }
                }
                if (!group) {
                    break;
                }
            }
            if (group) {
                ans = Math.max(ans, grpList.size());
            }
        }
        System.out.println(ans);
    }

}
