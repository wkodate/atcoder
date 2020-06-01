package com.wkodate.atcoder.abc024.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int d = sc.nextInt();
        int k = sc.nextInt();
        long[] l = new long[d];
        long[] r = new long[d];
        long[] s = new long[k];
        long[] t = new long[k];
        for (int i = 0; i < d; i++) {
            l[i] = sc.nextLong();
            r[i] = sc.nextLong();
        }
        for (int i = 0; i < k; i++) {
            s[i] = sc.nextLong();
            t[i] = sc.nextLong();
        }

        for (int i = 0; i < k; i++) {
            int arrived = 0;
            long pos = s[i];
            for (int j = 0; j < d; j++) {
                if (s[i] < t[i]) {
                    if (pos >= l[j]) {
                        pos = Math.max(pos, r[j]);
                    }
                    if (pos >= t[i]) {
                        arrived = j + 1;
                    }
                } else {
                    if (pos <= r[j]) {
                        pos = Math.min(pos, l[j]);
                    }
                    if (pos <= t[i]) {
                        arrived = j + 1;
                    }
                }
                if (arrived > 0) {
                    System.out.println(arrived);
                    break;
                }
            }
        }
    }

}
