package com.wkodate.atcoder.abc009.b;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int second = a[0];
        for (int i = n - 2; i >= 0; i--) {
            if (a[n - 1] == a[i]) {
                continue;
            }
            second = a[i];
            break;
        }
        System.out.println(second);
    }

}
