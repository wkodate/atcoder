package com.wkodate.atcoder.abc033.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] strs = s.split("\\+");
        long ans = 0;
        for (int i = 0; i < strs.length; i++) {
            String[] nums = strs[i].split("\\*");
            boolean hasZero = false;
            for (String num : nums) {
                if ("0".equals(num)) {
                    hasZero = true;
                    break;
                }
            }
            if (hasZero) {
                continue;
            }
            ans++;
        }
        System.out.println(ans);
    }

}
