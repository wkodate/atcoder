package com.wkodate.atcoder.agc033.b;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int na = sc.nextInt();
        int nb = sc.nextInt();
        long[] a = new long[na];
        long[] b = new long[nb];
        Set<Long> seta = new HashSet<>();
        Set<Long> setb = new HashSet<>();
        Set<Long> setab = new HashSet<>();
        for (int i = 0; i < na; i++) {
            a[i] = sc.nextLong();
            seta.add(a[i]);
        }
        for (int i = 0; i < nb; i++) {
            b[i] = sc.nextLong();
            setb.add(b[i]);
            if (seta.contains(b[i])) {
                setab.add(b[i]);
            }
        }
        System.out.println((double) setab.size() / (seta.size() + setb.size() - setab.size()));
    }

}
