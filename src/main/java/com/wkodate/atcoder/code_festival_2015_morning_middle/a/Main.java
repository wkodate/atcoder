package com.wkodate.atcoder.code_festival_2015_morning_middle.a;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long m = sc.nextLong();
        long r = sc.nextLong();
        long[] s = new long[n - 1];
        PriorityQueue<Long> heap = new PriorityQueue<>();
        for (int i = 0; i < n - 1; i++) {
            s[i] = sc.nextLong();
            heap.add(s[i]);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        long ksum = 0;
        long k1sum = 0;
        long size = heap.size();
        for (int i = 0; i < size; i++) {
            long ss = heap.poll();
            if (i != 0) {
                k1sum += ss;
            }
            ksum += ss;
        }
        if (n == k) {
            k1sum = ksum;
        }
        if ((double) ksum / k >= r) {
            System.out.println(0);
            return;
        }
        if ((double) (k1sum + m) / k < r) {
            System.out.println(-1);
            return;
        }
        System.out.println(k * r - k1sum);
    }

}
