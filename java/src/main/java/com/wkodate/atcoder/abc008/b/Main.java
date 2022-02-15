package com.wkodate.atcoder.abc008.b;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            map.put(s, map.getOrDefault(s, 1) + 1);
        }
        String maxKey = "";
        int maxValue = 0;
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() > maxValue) {
                maxKey = e.getKey();
                maxValue = e.getValue();
            }
        }
        System.out.println(maxKey);
    }

}
