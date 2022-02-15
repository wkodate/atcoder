package com.wkodate.atcoder.code_thanks_festival_2017_open.c;

import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        PriorityQueue<Entry<Integer, Long>> heap = new PriorityQueue<>(
                (n1, n2) -> (int) (n1.getValue() - n2.getValue()));
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextLong();
            heap.offer(new SimpleEntry<>(i, a[i]));
        }
        long ans = 0;
        for (int i = 0; i < k; i++) {
            Entry<Integer, Long> e = heap.poll();
            ans += e.getValue();
            e.setValue(e.getValue() + b[e.getKey()]);
            heap.add(e);
        }
        System.out.println(ans);
    }

}
