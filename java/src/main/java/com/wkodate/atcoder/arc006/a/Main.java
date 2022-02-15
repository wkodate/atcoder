package com.wkodate.atcoder.arc006.a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> e = new HashSet<>();
        for (int i = 0; i < 6; i++) {
            e.add(sc.nextInt());
        }
        int b = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            l.add(sc.nextInt());
        }
        int cnt = 0;
        int rest = 0;
        for (int i = 0; i < l.size(); i++) {
            if (e.contains(l.get(i))) {
                cnt++;
                continue;
            }
            rest = l.get(i);
        }
        if (cnt >= 6) {
            System.out.println(1);
        } else if (cnt >= 5) {
            if (rest == b) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        } else if (cnt >= 4) {
            System.out.println(4);
        } else if (cnt >= 3) {
            System.out.println(5);
        } else {
            System.out.println(0);
        }
    }

}
