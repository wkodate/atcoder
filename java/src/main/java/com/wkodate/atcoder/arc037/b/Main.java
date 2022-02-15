package com.wkodate.atcoder.arc037.b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static boolean dfs(Map<Integer, List<Integer>> map, boolean[] visited, int n, int prev) {
        visited[n] = true;
        List<Integer> list = map.get(n);
        if (map.size() == 1 && list.get(0) == prev) {
            return true;
        }
        boolean tree = true;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == prev) {
                continue;
            }
            if (visited[list.get(i)]) {
                return false;
            }
            if (!dfs(map, visited, list.get(i), n)) {
                tree = false;
                break;
            }
        }
        return tree;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] uv = new int[m][2];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            uv[i][0] = sc.nextInt();
            uv[i][1] = sc.nextInt();
            List<Integer> lu = map.get(uv[i][0]);
            lu.add(uv[i][1]);
            map.put(uv[i][0], lu);
            List<Integer> lv = map.get(uv[i][1]);
            lv.add(uv[i][0]);
            map.put(uv[i][1], lv);
        }
        int tree = 0;
        boolean[] visited = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            if (visited[i]) {
                continue;
            }
            if (dfs(map, visited, i, 0)) {
                tree++;
            }
        }
        System.out.println(tree);
    }

}
