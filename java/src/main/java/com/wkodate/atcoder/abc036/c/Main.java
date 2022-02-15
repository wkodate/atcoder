package com.wkodate.atcoder.abc036.c;

import java.util.ArrayList;
import java.util.Collections;
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
        long[] a = new long[n];
        Set<Long> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            set.add(a[i]);
        }
        List<Long> list = new ArrayList<>(set);
        Collections.sort(list);
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), i);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(map.get(a[i]));
        }
    }

}
