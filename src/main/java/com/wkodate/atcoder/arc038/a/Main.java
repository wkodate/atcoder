package com.wkodate.atcoder.arc038.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        int ans = 0;
        Collections.sort(a, Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                ans += a.get(i);
            }
        }
        System.out.println(ans);
    }

}
