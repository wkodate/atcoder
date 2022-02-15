package com.wkodate.atcoder.agc030.b;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long n = sc.nextLong();
        Deque<Long> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            deque.add(sc.nextLong());
        }
        long d = 0;

        long pos = 0;

        // FIXME
        while (true) {
            if (deque.isEmpty()) {
                break;
            }
            long firstDist;
            long lastDist;
            if (pos < deque.getFirst()) {
                firstDist = deque.getFirst() - pos;
                lastDist = pos + l - deque.getLast();
            } else {
                firstDist = l - pos + deque.getFirst();
                lastDist = pos + deque.getLast();
            }
            if (firstDist >= lastDist) {
                d += firstDist;
                pos = (pos + firstDist) % l;
                deque.removeFirst();
            } else {
                d += lastDist;
                pos = (pos + l - lastDist) % l;
                deque.removeLast();
            }
        }
        System.out.println(d);
    }

}
