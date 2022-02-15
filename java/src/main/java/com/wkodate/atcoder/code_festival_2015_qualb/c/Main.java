package com.wkodate.atcoder.code_festival_2015_qualb.c;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int j = n - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (j < 0 || b[i] > a[j]) {
                System.out.println("NO");
                return;
            }
            j--;
        }
        System.out.println("YES");
    }

}
