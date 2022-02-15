package com.wkodate.atcoder.arc042.a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        Set<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = m - 1; i >= 0; i--) {
            if (set.contains(a[i])) {
                continue;
            }
            set.add(a[i]);
            ans.add(a[i]);
        }
        for (int i = 1; i <= n; i++) {
            if (set.contains(i)) {
                continue;
            }
            ans.add(i);
        }
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }

}
