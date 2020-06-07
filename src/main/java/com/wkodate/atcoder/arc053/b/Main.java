package com.wkodate.atcoder.arc053.b;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int odd = 0;
        int even = 0;
        for (Integer v : map.values()) {
            if (v % 2 != 0) {
                odd++;
                even -= 1;
            }
            even += v;
        }
        if (odd == 0) {
            System.out.println(even);
            return;
        }
        System.out.println(1 + (int) Math.floor((double) even / (2 * odd)) * 2);
    }

}
