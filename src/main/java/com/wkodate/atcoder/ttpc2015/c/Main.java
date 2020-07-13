package com.wkodate.atcoder.ttpc2015.c;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static List<Integer> pattern;

    private static void permutate(int[] nums, String word, int len) {
        if (word.length() >= len) {
            pattern.add(Integer.parseInt(word));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            int[] nodup = new int[nums.length - 1];
            int idx = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                nodup[idx++] = nums[j];
            }
            permutate(nodup, word + nums[i], len);
        }
    }

    private static boolean isPrime(long x) {
        if (x < 2) {
            return false;
        } else if (x == 2) {
            return true;
        }
        if (x % 2 == 0) {
            return false;
        }
        for (long i = 3; i * i <= x; i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.substring(i, i + 1));
        }
        if (set.size() > 5) {
            System.out.println(-1);
            return;
        }
        pattern = new ArrayList<>();
        int[] CONVERT_NUM = { 1, 3, 5, 7, 9 };
        permutate(CONVERT_NUM, "", set.size());
        List<String> list = new ArrayList<>(set);
        for (int i = 0; i < pattern.size(); i++) {
            String word = s;
            String repPtn = String.valueOf(pattern.get(i));
            for (int j = 0; j < list.size(); j++) {
                word = word.replaceAll(list.get(j), repPtn.substring(j, j + 1));
            }
            long p = Long.parseLong(word);
            if (isPrime(p)) {
                System.out.println(p);
                return;
            }
        }
        System.out.println(-1);
    }

}
