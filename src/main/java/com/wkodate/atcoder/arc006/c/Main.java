package com.wkodate.atcoder.arc006.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }

        int[] stack = new int[n];
        for (int i = 0; i < w.length; i++) {
            int key = -1;
            int min = 100001;
            for (int j = 0; j < stack.length; j++) {
                if (stack[j] == 0) {
                    if (min == 100001) {
                        key = j;
                    }
                    break;
                }
                if (stack[j] >= w[i]) {
                    int diff = stack[j] - w[i];
                    if (diff < min) {
                        key = j;
                        min = diff;
                    }
                }
            }
            stack[key] = w[i];
        }
        int cnt = 0;
        for (int i = 0; i < stack.length; i++) {
            if (stack[i] == 0) {
                break;
            }
            cnt++;
        }
        System.out.println(cnt);
    }

}
