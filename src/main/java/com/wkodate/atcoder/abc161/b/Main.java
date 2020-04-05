package com.wkodate.atcoder.abc161.b;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        Arrays.sort(a);
        for (int i = n - 1; i > n - 1 - m; i--) {
            if (a[i] < (double) sum / (4 * m)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

}
