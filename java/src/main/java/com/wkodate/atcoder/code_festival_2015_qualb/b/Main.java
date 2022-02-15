package com.wkodate.atcoder.code_festival_2015_qualb.b;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        for (Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > n / 2) {
                System.out.println(e.getKey());
                return;
            }
        }
        System.out.println("?");
    }

}
