package com.wkodate.atcoder.abc016.c;

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
        int[] a = new int[m];
        int[] b = new int[m];
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            Set<Integer> set = new HashSet<>();
            map.put(i, set);
        }
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            map.get(a[i]).add(b[i]);
            map.get(b[i]).add(a[i]);
        }
        for (int i = 1; i <= n; i++) {
            Set<Integer> ans = new HashSet<>();
            Set<Integer> friendsset = map.get(i);
            List<Integer> friends = new ArrayList<>(map.get(i));
            for (int friend : friends) {
                List<Integer> ff = new ArrayList<>(map.get(friend));
                for (int j = 0; j < ff.size(); j++) {
                    if (friendsset.contains(ff.get(j))) {
                        continue;
                    }
                    ans.add(ff.get(j));
                }
            }
            if (ans.contains(i)) {
                System.out.println(ans.size() - 1);
                continue;
            }
            System.out.println(ans.size());
        }
    }

}
