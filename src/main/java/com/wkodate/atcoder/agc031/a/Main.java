package com.wkodate.atcoder.agc031.a;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// FIXME
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        String[] s = str.split("");
        long div = (long) Math.pow(10, 9) + 7;
        Map<String, Long> map = new HashMap<>();
        Map<String, Long> resultMap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(s[i])) {
                map.put(s[i], map.get(s[i]) + 1L);
                continue;
            }
            map.put(s[i], 1L);
        }

        long count = 0;
        for (long i = 0; i < Math.pow(2, map.size()); i++) {
            StringBuilder string = new StringBuilder();
            for (int j = 0; j <= map.size(); j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (((i >> j) & 1) == 1) {
                    string.append(map.keySet().toArray()[j]);
                }
            }
            String resultStr = string.toString();
            if ("".equals(resultStr)) {
                continue;
            }
            long c;
            String str1 = resultStr.substring(0, resultStr.length() - 1);
            String str2 = resultStr.substring(resultStr.length() - 1);
            if (resultMap.containsKey(str1)) {
                c = resultMap.get(str1) * map.get(str2) % div;
            } else {
                c = map.get(resultStr) % div;
            }
            resultMap.put(resultStr, c % div);
            count += c % div;
            System.out.println(resultStr + " " + c % div);
        }
        System.out.println(count);
    }
}
