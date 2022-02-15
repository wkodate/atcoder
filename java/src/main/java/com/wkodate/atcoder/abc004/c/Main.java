package com.wkodate.atcoder.abc004.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int[] nums = new int[6];
        long div = n / 5;
        long rem = n % 5;
        for (int i = 0; i < 6; i++) {
            nums[i] = (int) ((i + div) % 6) + 1;
        }
        for (int i = 0; i < rem; i++) {
            int tmp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = tmp;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append(nums[i]);
        }
        System.out.println(sb.toString());
    }

}
