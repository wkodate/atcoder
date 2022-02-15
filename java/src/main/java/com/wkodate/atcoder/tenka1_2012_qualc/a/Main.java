package com.wkodate.atcoder.tenka1_2012_qualc.a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Integer> sieveOfEratosthenes(int n) {
        if (n < 2) {
            return new ArrayList<>();
        }
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int p = 2; p <= sqrt; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i < n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (isPrime[i]) {
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> soe = sieveOfEratosthenes(n);
        System.out.println(soe.size());
    }

}
