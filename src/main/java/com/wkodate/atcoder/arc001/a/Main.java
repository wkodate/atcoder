package com.wkodate.atcoder.arc001.a;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] cn = sc.next().toCharArray();
        int[] cnt = new int[4];
        for (int i = 0; i < cn.length; i++) {
            char c = cn[i];
            if (c == '1') {
                cnt[0]++;
            } else if (c == '2') {
                cnt[1]++;
            } else if (c == '3') {
                cnt[2]++;
            } else {
                cnt[3]++;
            }
        }
        Arrays.sort(cnt);
        System.out.println(cnt[3] + " " + cnt[0]);
    }

}
