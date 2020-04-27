package com.wkodate.atcoder.arc022.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int N = sc.nextInt();
        int ans = N;
        int rem = 0;
        while (N > 0) {
            rem += N % m;
            N /= m;
            N *= n;
            ans += N;
        }
        while (rem >= m) {
            int remrem = rem % m;
            rem /= m;
            rem *= n;
            ans += rem;
            rem += remrem;
        }
        System.out.println(ans);
    }

}
