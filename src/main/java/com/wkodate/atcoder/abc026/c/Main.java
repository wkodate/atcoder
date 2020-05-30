package com.wkodate.atcoder.abc026.c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static int calcSaraly(List<Integer> mem, Map<Integer, List<Integer>> map) {
        if (mem.size() == 0) {
            return 1;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < mem.size(); i++) {
            int salary = calcSaraly(map.get(mem.get(i)), map);
            min = Math.min(min, salary);
            max = Math.max(max, salary);
        }
        return max + min + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n + 1];
        b[1] = 1;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int i = 2; i <= n; i++) {
            b[i] = sc.nextInt();
            List<Integer> list = map.get(b[i]);
            list.add(i);
            map.put(b[i], list);
        }
        System.out.println(calcSaraly(map.get(1), map));
    }

}
